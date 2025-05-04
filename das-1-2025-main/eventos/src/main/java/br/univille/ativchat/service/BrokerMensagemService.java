package br.univille.ativchat.service;

import java.util.function.Consumer;

import br.univille.ativchat.model.Mensagem;

public interface BrokerMensagemService {
    void enviarMensagem(Mensagem mensagem);

    void buscarMensagens(Consumer<Mensagem> mensagens);
}