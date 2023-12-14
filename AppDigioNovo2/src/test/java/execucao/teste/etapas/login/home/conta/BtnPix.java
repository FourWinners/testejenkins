package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;

import java.io.IOException;

/**
 *
 * Classe responsavel por acessar a area pix a partir da tela inicial Conta
 * CT-3008
 *
 *
 * @author Willian Araujo
 */
public class BtnPix {

    @When("^clicar no botao Pix$")
    public void clicar_no_botao_Pix() throws Exception {

        ElementosTelaInicialConta.btnPix();

    }

    @Then("^devera ser direcionado para a Area pix$")
    public void devera_ser_direcionado_para_a_Area_pix() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Pix","Area pix");

    }

}
