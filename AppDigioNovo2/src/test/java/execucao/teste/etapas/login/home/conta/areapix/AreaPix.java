package execucao.teste.etapas.login.home.conta.areapix;

import cucumber.api.java.en.Given;
import execucao.teste.paginas.login.ElementosLogin;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;

/**
 * Classe Responsável por acessar Area Pix pela tela inicial Conta
 * CT-4X
 */
public class AreaPix {

    @Given("^que o cliente esteja na area pix$")
    public void que_o_cliente_esteja_na_area_pix() throws Exception {

        ElementosLogin.login();
        ElementosLogin.envioSenha();
        ElementosLogin.validarHome();
        ElementosTelaInicialCartao.btnContaCartao();
        ElementosTelaInicialConta.btnPix();

    }
}
