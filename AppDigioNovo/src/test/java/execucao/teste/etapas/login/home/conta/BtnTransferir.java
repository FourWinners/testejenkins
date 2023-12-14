package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;


/**
 * CT-3005
 * Classe para validar botao Transferir na area Conta
 */

public class BtnTransferir extends BaseDados{

    @When("^clicar no botao Tranferir$")
    public void clicar_no_botao_Tranferir() throws Exception {

        ElementosTelaInicialConta.scrollBtnTransferir();
        PrintScreen.screenshot("Area conta do cliente","Validar botao Transferir","Botao transferir");
        ElementosTelaInicialConta.btnTransferir();

    }

    @Then("^devera ser direcionando para a area de transferencia$")
    public void devera_ser_direcionando_para_a_area_de_transferencia() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Transferir","Area transferencia");

    }

}
