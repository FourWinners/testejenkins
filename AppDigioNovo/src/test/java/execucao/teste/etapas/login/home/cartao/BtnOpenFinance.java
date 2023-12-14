package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

public class BtnOpenFinance {

    @When("^clicar no botao Open finance$")
    public void clicar_no_botao_Open_finance() throws Exception {

        ElementosTelaInicialCartao.scrollOpenFinance();
        PrintScreen.screenshot("Tela inicial", "Validar botao Open Finance", "Botao Open Finance");
        ElementosTelaInicialCartao.btnOpenFinanceCartao();

    }

    @Then("^devera ser direcionado para a area Open Finance$")
    public void devera_ser_direcionado_para_a_area_Open_Finance() throws IOException {

        PrintScreen.screenshot("Tela inicial", "Validar botao Open Finance", "Area Open Finance");

    }

}
