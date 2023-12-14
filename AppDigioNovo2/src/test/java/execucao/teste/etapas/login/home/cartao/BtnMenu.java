package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;
import java.io.IOException;

/**
 * Classe responsavel por acessar e validar o menu
 */
public class BtnMenu {

    @When("^clicar no botao Menu$")
    public void clicar_no_botao_Menu() throws Exception {

        ElementosTelaInicialCartao.btnMenu();

    }

    @Then("^devera ser direcionado para o Menu do aplicativo$")
    public void devera_ser_direcionado_para_o_Menu_do_aplicativo() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao Menu","Menu");

    }
    
}
