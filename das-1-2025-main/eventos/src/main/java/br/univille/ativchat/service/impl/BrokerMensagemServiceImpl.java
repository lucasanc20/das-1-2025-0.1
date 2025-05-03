package br.univille.ativchat.service.impl;

import java.util.function.Consumer;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

import br.univille.ativchat.model.Mensagem;
import br.univille.ativchat.service.BrokerMensagemService;

public class BrokerMensagemServiceImpl implements BrokerMensagemService {

    private static final String NOME_TOPICO = "topic-chat";
    private static final String NAMESPACE = "sb-das12025-test-brazilsouth.servicebus.windows.net";
    private static final String NOME_ASSINATURA = "subscription-artur";

    private final DefaultAzureCredential credencialAzure;
    private final ServiceBusSenderClient clienteEnvio;
    private ServiceBusProcessorClient clienteProcessador;

    public BrokerMensagemServiceImpl() {
        credencialAzure = new DefaultAzureCredentialBuilder().build();

        clienteEnvio = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(NAMESPACE)
                .credential(credencialAzure)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .sender()
                .topicName(NOME_TOPICO)
                .buildClient();
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        String conteudo = mensagem.nome() + ": " + mensagem.texto();
        ServiceBusMessage novaMensagem = new ServiceBusMessage(conteudo);
        clienteEnvio.sendMessage(novaMensagem);
        System.out.println("Mensagem enviada: " + conteudo);
    }

    @Override
    public void buscarMensagens(Consumer<Mensagem> consumidor) {
        clienteProcessador = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(NAMESPACE)
                .credential(credencialAzure)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .topicName(NOME_TOPICO)
                .subscriptionName(NOME_ASSINATURA)
                .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                .processMessage(contexto -> {
                    String corpo = contexto.getMessage().getBody().toString();
                    String[] dados = corpo.split(": ", 2);
                    Mensagem mensagemRecebida = new Mensagem(dados[0], dados[1]);
                    consumidor.accept(mensagemRecebida);
                    contexto.complete();
                })
                .processError(erro -> {
                    System.err.println("Erro ao processar mensagem: " + erro.getException().getMessage());
                })
                .buildProcessorClient();

        clienteProcessador.start();
    }
}

