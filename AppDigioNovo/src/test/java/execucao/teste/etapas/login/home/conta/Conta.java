package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.Given;
import execucao.teste.paginas.login.ElementosLogin;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;


/**
 * Classes responsavel por acessar pagina tela inicial Conta
 * @author Willian Araujo
 */
public class Conta {

    @Given("^que o cliente esteja na area conta$")
    public void que_o_cliente_esteja_na_area_conta() throws Exception {

        ElementosLogin.login();
        ElementosLogin.envioSenha();
      ElementosLogin.validarHome();
       ElementosTelaInicialCartao.btnContaCartao();

    }

}
