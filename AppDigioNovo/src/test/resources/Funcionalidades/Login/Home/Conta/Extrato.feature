#language: en


Feature: Extrato
  Como cliente digio
  Quero acessar a area Extrato
  Para poder gerenciar minhas transacoes realizadas

  @extrato
  Scenario: Validar comprovante detalhado transacao Recebimento via Pix
    Given que o cliente esteja na area Extrato
    When clicar em uma transacao Recebimento via Pix
    Then devera ser direcionado para comprovante detalhado
    And o valor com descricoes devem ser apresentados

  @extrato1
  Scenario: Validar comprovante detalhado transacao Pagamento via Pix
    Given que o cliente esteja na area Extrato
    When clicar em uma transacao Pagamento via Pix
    Then devera ser direcionado para um comprovante detalhado
    And o valor com as descricoes devem ser apresentados


  Scenario: Validar cancelamento de transacao agendada
    Given que o cliente esteja na area Extrato
    When clicar em uma transacao Recebimento via Pix
    Then devera ser direcionado para comprovante detalhado
    And o valor com descricoes devem ser apresentados
