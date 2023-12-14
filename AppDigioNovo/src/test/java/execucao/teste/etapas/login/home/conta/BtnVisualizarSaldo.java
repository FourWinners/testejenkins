package execucao.teste.etapas.login.home.conta;


import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * Classe responsavel por validar botao visualizar saldo na conta do cliente
 * CT-3001
 */
public class BtnVisualizarSaldo {

    @When("^clicar no botao visulizar saldo$")
    public void clicar_no_botao_visulizar_saldo() throws Exception {

        ElementosTelaInicialConta.btnVisualizarSaldoConta();

    }

    @Then("^o valor disponivel em conta devera ser apresentado ao cliente$")
    public void o_valor_disponivel_em_conta_devera_ser_apresentado_ao_cliente() throws IOException {

        PrintScreen.screenshot("Area conta do cliente","Visualizar saldo disponivel em conta","Visualizar Saldo");

    }

}
