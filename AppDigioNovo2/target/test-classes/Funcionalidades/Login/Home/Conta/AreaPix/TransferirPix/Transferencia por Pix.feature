#language: en
Feature: Transferir por Pix
  Como cliente digio
  Quero acessar a area de transferencias pix
  Para realixar transacoes pix

  @CT-5001
  Scenario: Validar transferencia chave valida pix por CPF
    Given que o cliente esteja na area de transferencias por pix
    When escolher o tipo chave CPF
    And realizar uma transferencia pix
    And a transacao for aprovada
    Then devera ser apresentado um comprovante de transferencia para o cpf do beneficiaria

  @CT-5002
  Scenario: Validar transferencia chave valida pix E-mail
    Given que o cliente esteja na area de transferencias por pix
    And escolher o tipo chave E-mail
    When realizar uma transferencia pix com chave E-mail
    And quando a transferencia for aprovada
    Then um comprovante de transferencia devera ser apresentado para a chave email do beneficiario

  @CT-5003
  Scenario: Validar transferencia chave valida pix Aleatoria
    Given que o cliente esteja na area de transferencias por pix
    And escolher o tipo chave Aleatoria
    When realizar uma transferencia pix com chave Aleatoria
    And quando a transacao for aprovada
    Then devera ser apresentado um comprovante de transferencia para a chave aleatoria do boeneficiario
