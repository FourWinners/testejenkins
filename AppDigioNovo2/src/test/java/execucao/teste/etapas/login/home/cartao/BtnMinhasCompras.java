package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.utilidades.Scroll;

import java.io.IOException;

public class BtnMinhasCompras {

    @When("^clicar no botao Minhas compras$")
    public void clicar_no_botao_Minhas_compras() throws Exception {

        Scroll.scrollVertical();
        PrintScreen.screenshot("Area cartao do cliente", "Validar botao Minhas compras", "Botao Minhas compras");
        ElementosTelaInicialCartao.btnMinhasCompras();

    }

    @Then("^devera ser direcionado para a area Minhas compras$")
    public void devera_ser_direcionado_para_a_area_Minhas_compras() throws IOException {

        PrintScreen.screenshot("Area cartao do cliente","Validar botao Minhas compras","Area Minhas compras");

    }


}
