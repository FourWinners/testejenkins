package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.utilidades.Scroll;

import java.io.IOException;

public class BtnMeuLimite {

    @When("^clicar no botao Meu Limite$")
    public void clicar_no_botao_Meu_Limite() throws Exception {

        Scroll.scrollVertical();
        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Meu Limite", "Botao Meu Limite");
        ElementosTelaInicialCartao.btnMeuLimite();

    }

    @Then("^devera ser direcionado para a area Ajuste de limite$")
    public void devera_ser_direcionado_para_a_area_Ajuste_de_limite() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Meu Limite", "Area ajuste limite");


    }

}
