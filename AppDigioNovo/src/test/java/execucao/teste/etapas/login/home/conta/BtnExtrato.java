package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;
import java.io.IOException;

/**
 * CT-3003
 * Classe para validar botao Extrato na area Conta
 */
public class BtnExtrato {


    @When("^clicar no botao Extrato$")
    public void clicar_no_botao_Extrato() throws Exception {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Extrato","Area Conta");
        ElementosTelaInicialConta.btnExtrato();

    }

    @Then("^devera ser direcionado para a area extrato detalhado$")
    public void devera_ser_direcionado_para_a_area_extrato_detalhado() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Extrato","Extrato detalhado");

    }
}
