package execucao.teste.etapas.login.home.conta.areapix.transferenciapix;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.login.home.conta.ElementosTelaInicialConta;
import execucao.teste.paginas.login.home.conta.areapix.transferenciapix.ElementosTransferenciaPorPix;
import execucao.teste.paginas.utilidades.ElementosUtilidades;
import execucao.teste.paginas.utilidades.EnvioSenhaTransferenciaPix;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.utilidades.Scroll;

import java.io.IOException;


/**
 * Classe responsavel por validar uma transferencia via pix utilizando chave Aleatoria
 * CT-5003
 */
public class BtnChaveAleatoria {


    PrintScreen print = new PrintScreen();
    ElementosTransferenciaPorPix transferir = new ElementosTransferenciaPorPix();
    EnvioSenhaTransferenciaPix senha = new EnvioSenhaTransferenciaPix();
    ElementosTelaInicialConta conta = new ElementosTelaInicialConta();
    ElementosTelaInicialCartao home = new ElementosTelaInicialCartao();
    ElementosUtilidades util = new ElementosUtilidades();
    Scroll scroll = new Scroll();


    @And("^escolher o tipo chave Aleatoria$")
    public void escolher_o_tipo_chave_Aleatoria() throws IOException {

        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","1Area Transferencia por pix");
        transferir.opcaoChaveAleatoria();

    }

    @When("^realizar uma transferencia pix com chave Aleatoria$")
    public void realizar_uma_transferencia_pix_com_chave_Aleatoria() throws IOException, InterruptedException {

//        util.envioChaveAleatoria();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","2Massa Beneficiaria");
//        util.btnContinuar();
//        transferir.valorTransferir();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","3Valor transferencia");
//        util.btnContinuar();
//        transferir.btnContinuar();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","4Limite antes e tipo de transferencia");
//        transferir.btnPagarComSaldo();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","5Revisao transferencia");
//        transferir.btnTransferir();
        senha.envioSenhaPix();
    }

    @And("^quando a transacao for aprovada$")
    public void quando_a_transacao_for_aprovada() throws IOException {

        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","6Transferencia enviada");
        transferir.btnAcessarComprovante();


    }

    @Then("^devera ser apresentado um comprovante de transferencia para a chave aleatoria do boeneficiario$")
    public void devera_ser_apresentado_um_comprovante_de_transferencia_para_a_chave_aleatoria_do_boeneficiario() throws IOException {

        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","7Comprovante transferencia1");
        scroll.scrollVertical();
        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix Aleatoria","8Comprovante transferencia2");

    }
}
