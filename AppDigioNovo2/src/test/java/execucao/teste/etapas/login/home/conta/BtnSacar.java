package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-3007
 * Classe para validar botao Sacar na area Conta
 */
public class BtnSacar {


    //Metodos de outras classes

    @When("^clicar no botao Sacar$")
    public void clicar_no_botao_Sacar() throws Exception {

        ElementosTelaInicialConta.scrollBtnSacar();
        PrintScreen.screenshot("Area conta do cliente","Validar botao Sacar","Bota sacar");
        ElementosTelaInicialConta.btnSacar();

    }

    @Then("^devera ser direcionado para a area saque digital$")
    public void devera_ser_direcionado_para_a_area_saque_digital() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Sacar","Area Saque digital");


    }
}
