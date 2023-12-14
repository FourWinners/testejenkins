package execucao.teste.etapas.login.home.menu;

import cucumber.api.java.pt.Dado;
import execucao.teste.paginas.login.ElementosLogin;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;


/**
 * Classe responsavel por acessar o Menu do aplicativo
 */
public class Menu {

    @Dado("^que o cliente esteja na tela menu$")
    public void que_o_cliente_esteja_na_tela_menu() throws Exception {

    ElementosLogin.login();
    ElementosLogin.envioSenha();
    ElementosLogin.validarHome();
    ElementosTelaInicialCartao.btnMenu();

    }


}
