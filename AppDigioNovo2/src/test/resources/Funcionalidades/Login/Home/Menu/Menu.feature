#language: pt
Funcionalidade: Menu
  Como cliente digio
  Quero acessar o menu do aplicativo digio
  Para gerenciar minha conta

  @CT-6001
  Cenario: Validar secao Meus dados
    Dado que o cliente esteja na tela menu
    Quando clicar em Meus dados
    Entao devera ser direcionado para a secao Meus dados

  Cenario: Validar secao Minha conta
    Dado que o cliente esteja na tela menu
    Quando clicar em Minha conta
    Entao devera ser direcionado para a secao Minha conta

  Cenario: Validar secao Meu cartao
    Dado que o cliente esteja na tela menu
    Quando clicar em Meu cartao
    Entao devera ser direcionado para a secao Meu cartao
