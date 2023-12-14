package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2007 Classe responsavel por validar botao Debito Automatico na tela
 * inicial.
 */

public class BtnDebitoAutomatico {

	@When("^clicar no botao Debito Automatico$")
	public void clicar_no_botao_Debito_Automatico() throws Exception {

		ElementosTelaInicialCartao.scrollDebitoAutomatico();
		PrintScreen.screenshot("Area cartao do cliente", "Validar botao Debito Automatico", "Botao Debito Automatico");
		ElementosTelaInicialCartao.btnDebitoAutomatico();

	}

	@Then("^devera ser direcionado para ativar ou desativar o debito automatico$")
	public void devera_ser_direcionado_para_ativar_ou_desativar_o_debito_automatico() throws IOException {

		PrintScreen.screenshot("Area cartao do cliente", "Validar botao Debito Automatico", "Area debito automatico");

	}
}
