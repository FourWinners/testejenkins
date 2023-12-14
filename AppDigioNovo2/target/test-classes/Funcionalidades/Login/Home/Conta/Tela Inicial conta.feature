#language: en


Feature: Area conta do cliente
  Como cliente digio
  Quero acessar a area minha conta
  Para poder gerenciar minhas transacoes

  @CT-3001
  Scenario: Validar botao visualizar ou ocultar saldo disponivel em conta
    Given que o cliente esteja na area conta
    When clicar no botao visulizar saldo
    Then o valor disponivel em conta devera ser apresentado ao cliente

  @CT-3002
  Scenario: Validar botao Pagar
    Given que o cliente esteja na area conta
    When clicar no botao pagar
    Then devera ser direcionado para a area de pagamentos

  @CT-3003
  Scenario: Validar botao Extrato
    Given que o cliente esteja na area conta
    When clicar no botao Extrato
    Then devera ser direcionado para a area extrato detalhado

  @CT-3004
  Scenario: Validar botao Trazer meu salario
    Given que o cliente esteja na area conta
    When clicar no botao Trazer meu salario
    Then devera ser direcionado para a area de portabilidade

  @CT-3005
  Scenario: Validar botao Transferir
    Given que o cliente esteja na area conta
    When clicar no botao Tranferir
    Then devera ser direcionando para a area de transferencia

  @CT-3006
  Scenario: Validar botao Receber
    Given que o cliente esteja na area conta
    When clicar no botao Receber
    Then devera ser direcionado para a area receber

  @CT-3007
  Scenario: Validar botao Sacar
    Given que o cliente esteja na area conta
    When clicar no botao Sacar
    Then devera ser direcionado para a area saque digital

  @CT-3008
  Scenario: Validar botao Pix
    Given que o cliente esteja na area conta
    When clicar no botao Pix
    Then devera ser direcionado para a Area pix

  @CT-3009
  Scenario: Validar botao Open Finance
    Given que o cliente esteja na area conta
    When clicar no botao Open Finance
    Then devera ser direcionado para a area

