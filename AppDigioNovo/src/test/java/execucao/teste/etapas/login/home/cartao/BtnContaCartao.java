package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * CT-2001 Classe responsavel por acessar area minha conta na tela inicial
 *
 */
public class BtnContaCartao {

	@When("^clicar no botao ContaCartao$")
	public void clicar_no_botao_ContaCartao() throws Exception {

		ElementosTelaInicialCartao.btnContaCartao();

	}

	@Then("^o cliente devera ser direcionado para a area conta$")
	public void o_cliente_devera_ser_direcionado_para_a_area_conta() throws IOException {

		PrintScreen.screenshot("Area cartao do cliente", "Validar area conta do cliente", "Area Minha Conta");

	}
}
