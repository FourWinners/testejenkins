package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

/**
 * CT-2006
 * Classe responsavel por validar botao Vencimento na tela inicial.
 *
 * @throws Exception
 */
public class BtnVencimento {

    @When("^clicar no botao Vencimento$")
    public void clicar_no_botao_Vencimento() throws Exception {

        ElementosTelaInicialCartao.scrolResumoFaturaEVencimento();
        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Vencimento", "Botao vencimento");

    }

    /**
     * Metodo responsavel por validar um elemento visivel na pagina Vencimento.
     *
     * @throws Exception
     */
    @Then("^devera ser direcionado para a area Alterar Vencimento da fatura$")
    public void devera_ser_direcionado_para_a_area_Alterar_Vencimento_da_fatura() throws Exception {

        ElementosTelaInicialCartao.btnVencimento();
        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Vencimento", "Area alterar vencimento");


    }
}
