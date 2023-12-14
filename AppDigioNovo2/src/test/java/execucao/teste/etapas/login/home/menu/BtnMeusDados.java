package execucao.teste.etapas.login.home.menu;

import cucumber.api.java.pt.*;
import execucao.teste.paginas.login.home.menu.ElementosMenu;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * Classe responsavel por
 */
public class BtnMeusDados {

    @Quando("^clicar em Meus dados$")
    public void clicar_em_Meus_dados() throws Exception {

        PrintScreen.screenshot("Menu","Validar secao Meus dados","Menu");
        ElementosMenu.btnMeusDados();

    }

    @Entao("^devera ser direcionado para a secao Meus dados$")
    public void devera_ser_direcionado_para_a_secao_Meus_dados() throws IOException {

        PrintScreen.screenshot("Menu","Validar secao Meus dados","Meus dados");    }
}
