package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2009 Classe responsavel por acessar area Servicos FGTS na tela inicial Cartao
 *
 */
public class BtnAnteciparFgts {

    @When("^clicar no botao Antecipar FGTS$")
    public void clicar_no_botao_Antecipar_FGTS() throws Exception {

        ElementosTelaInicialCartao.btnAntecipeFgts();

    }

    @Then("^devera ser direcionado para a area servicos fgts$")
    public void devera_ser_direcionado_para_a_area_servicos_fgts() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao Antecipar FGTS","Area servico Fgts");

    }

}
