package execucao.teste.etapas.login.home.conta;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;


/**
 * CT-3004
 * Classe para validar botao Trazer meu salario na area Conta
 * @author Willian Araujo
 */
public class BtnTrazerMeuSalario {

    @When("^clicar no botao Trazer meu salario$")
    public void clicar_no_botao_Trazer_meu_salario() throws Exception {

        //Metodo utilizado para deixar o botao Trazer meu salario visivel
        ElementosTelaInicialConta.scrollBtnTransferir();
        PrintScreen.screenshot("Area conta do cliente","Validar botao Trazer meu salario","Area Conta");
        ElementosTelaInicialConta.btnTrazerMeuSalario();

    }

    @Then("^devera ser direcionado para a area de portabilidade$")
    public void devera_ser_direcionado_para_a_area_de_portabilidade() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Validar botao Trazer meu salario","Area trazer salario");

    }
}
