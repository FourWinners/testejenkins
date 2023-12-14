package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;


import java.io.IOException;

/**
 * Classe responsavel por acessar a area pix a partir da tela inicial Conta
 * CT-3009
 */
public class BtnOpenFinanceConta {

    @When("^clicar no botao Open Finance$")
    public void clicar_no_botao_Open_Finance() throws Exception {

        ElementosTelaInicialConta.btnOpenFinance();

    }

    @Then("^devera ser direcionado para a area$")
    public void devera_ser_direcionado_para_a_area() throws IOException {

        PrintScreen.screenshot("Area conta do cliente", "Validar botao Open Finance", "Area open finance");

    }

}
