package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

public class BtnVisualizarSaldoFatura {

    @When("^clicar no botao visualizar saldo fatura cartao$")
    public void clicar_no_botao_visualizar_saldo_fatura_cartao() throws Exception {

        ElementosTelaInicialCartao.btnVisualizarSaldoCartao();

    }

    @Then("^devera ser apresentado o valor total da fatura$")
    public void devera_ser_apresentado_o_valor_total_da_fatura() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao visualizar saldo fatura cartao","Visualizar Saldo a pagar");

    }
}
