## Planner ✈
### Sobre o projeto
<p>O projeto tem como objetivo ajudar o usuário a organizar suas viagens à trabalho ou lazer.<br>
O usuário pode criar uma viagem com nome, data de início e fim.<br>
Dentro da viagem o usuário pode planejar sua viagem adicionando atividades para realizar em cada dia.</p>

## Requisitos
### Requisitos funcionais
-  O usuário cadastra uma viagem informando o ```local de destino```, ```data de início```, ```data de término```, ```e-mails dos convidados```, ```seu nome completo``` e ```endereço de e-mail```;
-  O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem;
-  Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem;
-  Na página do evento, os participantes podem adicionar links importantes da viagem como reserva no AirBnB, locais para serem visitados e etc;
-  Ainda na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário;
-  Novos participantes podem ser convidados dentro da página do evento através do e-mail e assim devem passar pelo fluxo de confirmação como qualquer outro convidado;

### Configuração e criação do projeto
- [x]  Criar projeto usando [Spring Initializr](https://start.spring.io/)
    - Spring Web
    - Flyway
    - Dev Tools
    - Lombok
    - JPA
    - H2 Database
- [x]  Configurar banco de dados na aplicação

## Implementar funcionalidades das viagens
- [X]  Criar migration para criação da tabela `trips`
- [X]  Criar entidades que irá representar uma `Trip`
- [X]  Criar repository da entidade viagem
- [X]  Criar endpoint de cadastro de viagem **`POST**/trips`
- [X]  Criar endpoint de consulta de viagem **`GET**/trips/{tripId}`
- [X]  Criar endpoint de atualização de viagem **`PUT**/trips/{tripId}`
- [X]  Criar endpoint confirmação de viagem **`GET**/trips/{tripId}/confirm`

## Cadastro e confirmação de participantes
- [X]  Criar tabela de `Participant`
- [X]  Criar entidade que irá representar um`Participant`
- [X]  Criar repository da entidade participante
- [X]  Criar endpoint confirmação de participante **`POST**/participants/{participantId}/confirm`
- [X]  Criar endpoint para convidar participante **`POST**/trips/{tripId}/invites`
- [X]  Criar endpoint para consultar participantes **`GET**/trips/{tripId}/participants`

## Funcionalidades que dizem respeito as atividades da viagem e links
- [X]  Criar tabela de `Activities`
- [X]  Criar entidade que irá representar uma `Activity`
- [X]  Criar repository da entidade atividade
- [X]  Criar endpoint para cadastro de atividade **`POST**/trips/{tripId}/activities`
- [X]  Criar endpoint para consultar atividades de uma viagem **`GET**/trips/{tripId}/invites`
- [X]  Criar tabela de `Links`
- [X]  Criar entidade que irá representar um `Link`
- [X]  Criar repository da entidade links
- [X]  Criar endpoint para criação de link **`POST**/trips/{tripId}/links`
- [X]  Criar endpoint para consultar links de uma viagem **`GET**/trips/{tripId}/links`