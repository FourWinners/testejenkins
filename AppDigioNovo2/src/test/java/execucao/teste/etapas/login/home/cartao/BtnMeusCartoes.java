package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;


/**
 * CT-2004
 * Classe responsavel por validar o botao Meus Cartoes na tela inicial.
 */
public class BtnMeusCartoes {

    @When("^clicar no botao Meus Cartoes$")
    public void clicar_no_botao_Meus_Cartoes() throws Exception {

        ElementosTelaInicialCartao.btnMeusCartoes();

    }

    @Then("^devera ser direcionado para a area Meus Cartoes$")
    public void devera_ser_direcionado_para_a_area_Meus_Cartoes() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Meus Cartoes", "Area Meus Cartoes");

    }
}
