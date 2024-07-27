## Planner ✈
### Sobre o projeto
<p>O projeto tem como objetivo ajudar o usuário a organizar suas viagens à trabalho ou lazer.<br>
O usuário pode criar uma viagem com nome, data de início e fim.<br>
Dentro da viagem o usuário pode planejar sua viagem adicionando atividades para realizar em cada dia.</p>

## Requisitos
### Requisitos funcionais
- [X] O usuário cadastra uma viagem informando o ```local de destino```, ```data de início```, ```data de término```, ```e-mails dos convidados```, ```seu nome completo``` e ```endereço de e-mail```;
- [ ] O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem;
- [ ] Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem;
- [ ] Na página do evento, os participantes podem adicionar links importantes da viagem como reserva no AirBnB, locais para serem visitados e etc;
- [ ] Ainda na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário;
- [ ] Novos participantes podem ser convidados dentro da página do evento através do e-mail e assim devem passar pelo fluxo de confirmação como qualquer outro convidado;

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
- [ ]  Criar endpoint de atualização de viagem **`PUT**/trips/{tripId}`
- [ ]  Criar endpoint confirmação de viagem **`GET**/trips/{tripId}/confirm`

## Cadastro e confirmação de participantes
- [ ]  Criar tabela de `Participant`
- [ ]  Criar entidade que irá representar um`Participant`
- [ ]  Criar repository da entidade participante
- [ ]  Criar endpoint confirmação de participante **`POST**/participants/{participantId}/confirm`
- [ ]  Criar endpoint para convidar participante **`POST**/trips/{tripId}/invites`
- [ ]  Criar endpoint para consultar participantes **`GET**/trips/{tripId}/participants`

## Funcionalidades que dizem respeito as atividades da viagem e links
- [ ]  Criar tabela de `Activities`
- [ ]  Criar entidade que irá representar uma `Activity`
- [ ]  Criar repository da entidade atividade
- [ ]  Criar endpoint para cadastro de atividade **`POST**/trips/{tripId}/activities`
- [ ]  Criar endpoint para consultar atividades de uma viagem **`GET**/trips/{tripId}/invites`
- [ ]  Criar tabela de `Links`
- [ ]  Criar entidade que irá representar um `Link`
- [ ]  Criar repository da entidade links
- [ ]  Criar endpoint para criação de link **`POST**/trips/{tripId}/links`
- [ ]  Criar endpoint para consultar links de uma viagem **`GET**/trips/{tripId}/links`

## Features complementares
- [ ]  Adicionar uma validação nos campos de data
    - [ ]  A data de começo da viagem, é inferior a data de término viagem
    - [ ]  A data de uma atividade está entre as datas da viagem
        
        **Exemplo:**
        Viagem entre os dias 20 á 25 de julho no Rio de Janeiro
        
        ⇒ Atividade 19 de julho
        
        ⇒ Atividade 21 de julho
        
- [ ]  Extração do core das trips pra dentro de uma classe Service
- [ ]  Mapeamento das exceções
    - [ ]  Tratativas de erro personalizadas
