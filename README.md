# das-1-2025-0.1

## Aula 26/02/2025
[Livro Eng Soft Moderna - Cap 7](https://engsoftmoderna.info/cap7.html)
- Interfaces
- Pacotes
- Componentes
- Módulos
- Camadas
- Serviços

Monolito
- Repositório único de codigo
- Uso de uma única tecnologia padrão
- Compilado, testado, único pacote
- Deploy como um único sistema
- Executado como um único processo no sistema operacional
- Único banco de dados

## Aula 05/03/2025
- Padrão arquitetural = solução para um problema específico
  - MVC - separa as responsabilidades (Model(dados) - View(tela) - Control(comportamento))
- Estilo arquitetura = organização do projeto

- Arquitetura em camadas
  - Divisão de responsabilidade
  - Performance
  - Segurança
  - Manutenibilidade
  - Camada de apresentação
    - Requisitos próprios
  - Camada de lógica de negócio (aplicação)
    - local central para definição e atualização das regras
    - escalar o backend suportar as requisições
  - Camada de persistência
    - Banco de dados relacional - consolidada
    - Resolve problemas de concorrência
    - Permite compartilhamento de dados
    
## Aula 06/03/2025
- [Who Needs an Architect?](https://martinfowler.com/ieeeSoftware/whoNeedsArchitect.pdf)
  
- O que é arquitetura?
É o conjunto de partes mais importantes de um projeto no entendimento interno dele, dos desenvolvedores.

- Qual o comportamento do arquiteto da "Matrix"?
Ele faz todas as decisões importantes sobre como o projeto será feito, as tecnologias que serão utilizadas e a estrutura dele para garantir a integridade conceitual do projeto, garantir que tudo faça sentido junto.

- Qual o comportamento do arquiteto ideal?
Ele trabalha juntamente com a equipe para entender as entranhas do projeto e orientá-los da melhor maneira, participando da programação, entrando em uma reunião com o time de requisitos, para ter certeza que tudo vai ficar nos trilhos


## Aula 13/03/2025
[Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:2)

- [Pensamento Arquitetônico](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4)


## Aula 19/03/2025
- Trade-offs
- Tópicos
- Filas
- Fan out

## Aula 02/04/2025
- Trabalho sobre tópicos (CHAT)

## Aula 03/04/2025
- [Filas](https://learn.microsoft.com/en-us/azure/service-bus-messaging/service-bus-queues-topics-subscriptions)

## Aula 09/04/2024
- [Características Arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26%5B%3Bvnd.vst.idref%3Dcap4.xhtml%5D!/4)
- O capítulo aborda a importância de considerar as características da arquitetura ao projetar sistemas de software, destacando que elas vão além dos requisitos funcionais e são essenciais para o sucesso da aplicação. Esses aspectos, muitas vezes chamados de requisitos não funcionais ou atributos de qualidade, são definidos pelos autores como características da arquitetura justamente para reforçar sua relevância. Elas devem cumprir três critérios fundamentais: não pertencer ao domínio do problema, impactar a estrutura do sistema e ser essenciais para o funcionamento da aplicação.
Entre os tipos de características, estão as operacionais, que envolvem o desempenho do sistema em produção, como disponibilidade, confiabilidade e escalabilidade; as estruturais, relacionadas à qualidade interna e à organização do código, como modularidade e manutenibilidade; e as transversais, que incluem temas como acessibilidade, segurança, privacidade e conformidade legal. O arquiteto deve priorizar aquelas que realmente fazem diferença, já que um excesso de exigências pode aumentar a complexidade do projeto. Além disso, muitas dessas características são implícitas e exigem sensibilidade e experiência para serem identificadas. O capítulo ainda menciona que referências como a norma ISO podem ajudar a definir critérios mais objetivos e cita o exemplo curioso da “Italy-ility”, uma exigência arquitetural inspirada em um evento real que exigiu robustez e resiliência específicas no sistema.

## Aula 16/04/2024
- [Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)
- O capítulo "Fundamentos" introduz os conceitos essenciais da arquitetura de software, estabelecendo uma base para entender padrões mais complexos. Ele começa explicando os estilos de arquitetura como modelos que oferecem um vocabulário comum para arquitetos, destacando o padrão de camadas como um dos mais duradouros. Em contraste, apresenta o antipadrão conhecido como "Grande Bola de Lama", que surge quando não há uma estrutura clara, tornando o sistema difícil de manter.
A evolução das arquiteturas é apresentada desde as soluções unitárias até o modelo cliente/servidor, incluindo variações com desktop e web, e culminando na arquitetura de três camadas, que promove maior separação de responsabilidades. O capítulo também diferencia arquiteturas monolíticas, com implementação unificada, das distribuídas, compostas por serviços que se comunicam remotamente.
Um ponto central do capítulo são as oito falácias da computação distribuída, que alertam sobre suposições equivocadas, como a crença de que a rede é sempre confiável, que a latência é nula, ou que a largura de banda é infinita. Essas falácias expõem riscos ocultos e mostram a necessidade de considerar falhas, segurança, mudanças de topologia, diversidade de administradores, custos e a heterogeneidade da infraestrutura.
Além dessas falácias, o texto aborda os desafios práticos enfrentados em arquiteturas distribuídas, como a complexidade de rastrear requisições em logs espalhados, o gerenciamento de transações que envolvem vários serviços e a manutenção de contratos entre sistemas independentes. Todos esses fatores tornam o design e a manutenção de sistemas distribuídos uma tarefa complexa, exigindo atenção especial desde as etapas iniciais do projeto.
