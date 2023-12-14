package execucao.teste.etapas.login.home.menu;

import cucumber.api.java.pt.*;
import execucao.teste.paginas.login.home.menu.ElementosMenu;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

public class BtnMinhaConta {

    PrintScreen print = new PrintScreen();
    ElementosMenu menu = new ElementosMenu();

    @Quando("^clicar em Minha conta$")
    public void clicar_em_Minha_conta() throws IOException {

        print.screenshot("Menu","Validar secao Minha conta","Menu");
        menu.btnMinhaConta();

    }

    @Entao("^devera ser direcionado para a botao Minha conta$")
    public void devera_ser_direcionado_para_a_botao_Minha_conta() throws IOException {

        print.screenshot("Menu","Validar secao Minha conta","Minha conta");

    }
}
