package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2010 Classe responsavel por acessar area Grana Extra na tela inicial Cartao
 *
 */
public class BtnGranaExtra {

    @When("^clicar no botao Grana Extra$")
    public void clicar_no_botao_Grana_Extra() throws Exception {

        ElementosTelaInicialCartao.btnGranaExtra();

    }

    @Then("^devera ser direcionado para a area Grana Extra$")
    public void devera_ser_direcionado_para_a_area_Grana_Extra() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao Antecipar FGTS","Area Grana extra");

    }


}
