package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;
import java.io.IOException;


/**
 * CT-3002
 * Classe para validar botao Pagar na area Conta
 */
public class BtnPagar {

    @When("^clicar no botao pagar$")
    public void clicar_no_botao_pagar() throws Exception {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Pagar","Area Conta");
        ElementosTelaInicialConta.btnPagar();

    }

    @Then("^devera ser direcionado para a area de pagamentos$")
    public void devera_ser_direcionado_para_a_area_de_pagamentos() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Pagar","Area Pagamentos");

    }
}
