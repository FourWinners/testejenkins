
  Feature: Login
    Como cliente digio
    Quero realizar uma autenticacao com meu cpf e senha
    Para conseguir utilizar os servicos da digio

    @CT-1001
    Scenario: Validar login com cpf valido cadastrado
      Given que o cliente acesse o aplicativo com CPF e senha
      When autenticar a senha
      Then devera ser direcionado para a tela inicial do aplicativo



