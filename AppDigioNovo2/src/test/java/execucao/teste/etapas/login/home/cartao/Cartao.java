package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.ElementosLogin;

/**
 * Classes responsavel por acessar pagina tela inicial Cartao
 * CT-2X
 */
public class Cartao {

    @Given("^que o cliente esteja na area cartao$")
    public void que_o_cliente_esteja_na_area_cartao() throws Exception {

        ElementosLogin.login();
        ElementosLogin.envioSenha();
        ElementosLogin.validarHome();

    }

}
