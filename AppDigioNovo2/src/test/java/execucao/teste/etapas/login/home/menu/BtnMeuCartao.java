package execucao.teste.etapas.login.home.menu;

import cucumber.api.java.pt.*;
import execucao.teste.paginas.login.home.menu.ElementosMenu;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;


/**
 * CT-6003
 * Classe para validar secao Meu cartao no meu do aplicativo
 */
public class BtnMeuCartao {

    PrintScreen print = new PrintScreen();
    ElementosMenu menu = new ElementosMenu();

    @Quando("^clicar em Meu cartao$")
    public void clicar_em_Meu_cartao() throws IOException {

        print.screenshot("Menu","Validar secao Meu cartao","Menu");
        menu.btnMeuCartao();

    }

    @Entao("^devera ser direcionado para a secao Meu cartao$")
    public void devera_ser_direcionado_para_a_secao_Meu_cartao() throws IOException {

        print.screenshot("Menu","Validar secao Meu cartao","Meu Cartao");

    }
}
