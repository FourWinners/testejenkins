package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2003
 * Classe responsavel por validar botao Pagar Fatura na tela inicial.
 */

public class BtnPagarFatura {

    @When("^clicar no botao pagar fatura$")
    public void clicar_no_botao_pagar_fatura() throws Exception {

        ElementosTelaInicialCartao.BtnPagarFatura();

    }

    @Then("^devera ser direcionado para area faturas$")
    public void devera_ser_direcionado_para_area_faturas() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente", "Validar botao pagar fatura pela tela home", "Area pagamentos fatura");
    }

}
