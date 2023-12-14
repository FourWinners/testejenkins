
package execucao.teste.etapas.login;

import java.io.IOException;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.ElementosLogin;


/**
 * CT-1001 Classe responsável por validar um login
 */
public class Login {
	@Given("^que o cliente acesse o aplicativo com CPF e senha$")
	public void que_o_cliente_acesse_o_aplicativo_com_CPF_e_senha() throws Exception {

		ElementosLogin.login();

	}

	@When("^autenticar a senha$")
	public void autenticar_a_senha() throws Exception {

		ElementosLogin.envioSenha();

	}

	@Then("^devera ser direcionado para a tela inicial do aplicativo$")
	public void devera_ser_direcionado_para_a_tela_inicial_do_aplicativo() throws Exception {

		ElementosLogin.validarHome();

	}

}
