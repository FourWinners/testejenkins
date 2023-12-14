package execucao.teste.etapas.login.home.conta.areapix;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.areapix.ElementosAreaPix;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * Classe responsavel por acessar e validar pagina Minhas chaves pela Area pix
 * CT-4001
 *
 * @author Willian Araujo
 */
public class BtnMinhasChaves {

    /**
     * Metodo responsavel por clicar em Minhas chaves
     * @throws IOException
     */
    @When("^clicar em Minhas chaves$")
    public void clicar_em_Minhas_chaves() throws Exception {

        PrintScreen.screenshot("Area Pix","Validar area Minhas chaves","Area Pix");
        ElementosAreaPix.btnMinhasChaves();

    }

    @Then("^devera ser direcionado para area Minhas Chaves$")
    public void devera_ser_direcionado_para_area_Minhas_Chaves() throws IOException {

        PrintScreen.screenshot("Area Pix","Validar area Minhas chaves","Area Minhas chaves");

    }
}
