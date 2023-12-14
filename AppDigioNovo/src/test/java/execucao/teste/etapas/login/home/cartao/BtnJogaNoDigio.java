package execucao.teste.etapas.login.home.cartao;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;

/**
 * CT-2013 Classe responsavel por validar botao Joga no Digio na tela inicial cartao
 *
 */
public class BtnJogaNoDigio {

    @When("^clicar no botao Joga no Digio$")
    public void clicar_no_botao_Joga_no_Digio() throws Exception {

        ElementosTelaInicialCartao.btnJogaNoDigio();

    }

    @Then("^devera ser direcionado para a area Promocao Joga no Digio$")
    public void devera_ser_direcionado_para_a_area_Promocao_Joga_no_Digio() {



    }
    
    
}
