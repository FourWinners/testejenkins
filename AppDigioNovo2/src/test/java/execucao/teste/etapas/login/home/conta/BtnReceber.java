package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-3006
 * Classe para validar botao Receber na area Conta
 */
public class BtnReceber {

    @When("^clicar no botao Receber$")
    public void clicar_no_botao_Receber() throws Exception {

        ElementosTelaInicialConta.scrollBtnReceber();
        PrintScreen.screenshot("Area conta do cliente","Validar botao Receber","Botao receber");
        ElementosTelaInicialConta.btnReceber();

    }

    @Then("^devera ser direcionado para a area receber$")
    public void devera_ser_direcionado_para_a_area_receber() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Receber","Area Receber");

    }

}
