package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2011 Classe responsavel por validar botao loja na tela inicial cartao
 *
 */
public class BtnLoja {

    @When("^clicar no botao Loja$")
    public void clicar_no_botao_Loja() throws Exception {

        ElementosTelaInicialCartao.scrollOpenFinance();
        PrintScreen.screenshot("Area cartao do cliente","Validar botao Loja","Botao Loja");
        ElementosTelaInicialCartao.btnLoja();

    }

    @Then("^devera ser direcionado para a area DigioLoja$")
    public void devera_ser_direcionado_para_a_area_DigioLoja() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao Loja","Loja Digio");

    }
}
