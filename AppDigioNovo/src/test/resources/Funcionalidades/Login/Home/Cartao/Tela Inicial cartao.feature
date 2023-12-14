#language: en
Feature: Area cartao do cliente
  Como cliente digio
  Quero acessar a area cartao
  Para poder gerenciar os servicos disponiveis

  @CT-2001
  Scenario: Validar area conta do cliente
    Given que o cliente esteja na area cartao
    When clicar no botao ContaCartao
    Then o cliente devera ser direcionado para a area conta

  @CT-2002
  Scenario: Validar botao visualizar saldo fatura cartao
    Given que o cliente esteja na area cartao
    When clicar no botao visualizar saldo fatura cartao
    Then devera ser apresentado o valor total da fatura

  @CT-2003
  Scenario: Validar botao Pagar Fatura pela tela home
    Given que o cliente esteja na area cartao
    When clicar no botao pagar fatura
    Then devera ser direcionado para area faturas

  @CT-2004
  Scenario: Validar botao Meus Cartoes
    Given que o cliente esteja na area cartao
    When clicar no botao Meus Cartoes
    Then devera ser direcionado para a area Meus Cartoes

  @CT-2005
  Scenario: Validar botao Resumo da Fatura
    Given que o cliente esteja na area cartao
    When clicar no botao Resumo da Fatura
    Then devera ser direcionado para a area Resumo da Fatura

  @CT-2006
  Scenario: Validar botao Vencimento
    Given que o cliente esteja na area cartao
    When clicar no botao Vencimento
    Then devera ser direcionado para a area Alterar Vencimento da fatura

  @CT-2007
  Scenario: Validar botao Debito Automatico
    Given que o cliente esteja na area cartao
    When clicar no botao Debito Automatico
    Then devera ser direcionado para ativar ou desativar o debito automatico

  @CT-2008
  Scenario: Validar botao Menu
    Given que o cliente esteja na area cartao
    When clicar no botao Menu
    Then devera ser direcionado para o Menu do aplicativo

  @CT-2009
  Scenario: Validar botao Antecipar FGTS
    Given que o cliente esteja na area cartao
    When clicar no botao Antecipar FGTS
    Then devera ser direcionado para a area servicos fgts

  @CT-2010
  Scenario: Validar botao Grana Extra
    Given que o cliente esteja na area cartao
    When clicar no botao Grana Extra
    Then devera ser direcionado para a area Grana Extra

  @CT-2011
  Scenario: Validar botao Loja
    Given que o cliente esteja na area cartao
    When clicar no botao Loja
    Then devera ser direcionado para a area DigioLoja

  @CT-2012
  Scenario: Validar botao Open Finance
    Given que o cliente esteja na area cartao
    When clicar no botao Open finance
    Then devera ser direcionado para a area Open Finance

  @CT-2013
  Scenario: Validar botao Joga no Digio
    Given que o cliente esteja na area cartao
    When clicar no botao Joga no Digio
    Then devera ser direcionado para a area Promocao Joga no Digio

  @CT-2014
  Scenario: Validar botao Meu Limite
    Given que o cliente esteja na area cartao
    When clicar no botao Meu Limite
    Then devera ser direcionado para a area Ajuste de limite

  @CT-2015
  Scenario: Validar botao Minhas compras
    Given que o cliente esteja na area cartao
    When clicar no botao Minhas compras
    Then devera ser direcionado para a area Minhas compras
