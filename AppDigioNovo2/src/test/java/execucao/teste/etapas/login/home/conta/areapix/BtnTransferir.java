package execucao.teste.etapas.login.home.conta.areapix;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.areapix.ElementosAreaPix;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-4004
 * Classe Responsável por acessar Area Pix pelo botao Transferir na pagina inicial Conta
 */

public class BtnTransferir {

    @When("^clicar no botao Transferir$")
    public void clicar_no_botao_Transferir() throws Exception {

        PrintScreen.screenshot("Area Pix", "Validar botao Transferir", "Area Pix");
        ElementosAreaPix.btnTransferir();

    }

    @Then("^devera ser direcionado para area tipo de chave$")
    public void devera_ser_direcionado_para_area_tipo_de_chave() throws IOException {

        PrintScreen.screenshot("Area Pix", "Validar botao Transferir", "Area Transferir pix");

    }
}
