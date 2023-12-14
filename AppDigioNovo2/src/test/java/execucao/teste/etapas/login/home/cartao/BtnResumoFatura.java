package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2005
 * Classe responsavel por validar botao Resumo da Fatura na tela inicial.
 */
public class BtnResumoFatura {


    /**
     * Metodo responsavel por clicar no botao Resmumo fatura na tela inicial cartao
     *
     * @throws Exception
     */
    @When("^clicar no botao Resumo da Fatura$")
    public void clicar_no_botao_Resumo_da_Fatura() throws Exception {

        ElementosTelaInicialCartao.scrolResumoFaturaEVencimento();
        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Resumo da Fatura", "Botao Resumo fatura");
        ElementosTelaInicialCartao.btnResumoFatura();

    }

    @Then("^devera ser direcionado para a area Resumo da Fatura$")
    public void devera_ser_direcionado_para_a_area_Resumo_da_Fatura() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Resumo da Fatura", "Resumo da fatura");

    }

}
