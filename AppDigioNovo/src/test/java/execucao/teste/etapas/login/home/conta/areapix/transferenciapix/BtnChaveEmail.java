package execucao.teste.etapas.login.home.conta.areapix.transferenciapix;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.areapix.transferenciapix.ElementosTransferenciaPorPix;
import execucao.teste.paginas.utilidades.ElementosUtilidades;
import execucao.teste.paginas.utilidades.EnvioSenhaTransferenciaPix;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.utilidades.Scroll;

import java.io.IOException;


/**
 * Classe responsavel por validar uma transferencia via pix utilizando chave E-mail
 * CT-5002
 */
public class BtnChaveEmail {

    PrintScreen print = new PrintScreen();
    ElementosTransferenciaPorPix transferir = new ElementosTransferenciaPorPix();
    EnvioSenhaTransferenciaPix senha = new EnvioSenhaTransferenciaPix();
    ElementosUtilidades util = new ElementosUtilidades();

    Scroll scroll = new Scroll();


    @And("^escolher o tipo chave E-mail$")
    public void escolher_o_tipo_chave_E_mail() throws IOException {

        print.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix E-mail", "1Area Transferencia por pix");
        transferir.opcaoEmail();

    }

    @When("^realizar uma transferencia pix com chave E-mail$")
    public void realizar_uma_transferencia_pix_com_chave_E_mail() throws IOException, InterruptedException {

        util.envioChaveEmail();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix E-mail","2Massa Beneficiaria");
//        util.btnContinuar();
//        transferir.valorTransferir();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix E-mail","3Valor transferencia");
//
//        util.btnContinuar();
//        transferir.btnContinuar();
//        print.screenshot("Transferencia por Pix","Validar transferencia chave valida pix E-mail","4Limite antes e tipo de transferencia");
//        transferir.btnPagarComSaldo();
        print.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix E-mail", "5Revisao transferencia");
        transferir.btnTransferir();
        senha.envioSenhaPix();
    }

    @And("^quando a transferencia for aprovada$")
    public void quando_a_transferencia_for_aprovada() throws IOException {

        print.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix E-mail", "6Transferencia enviada");
        transferir.btnAcessarComprovante();

    }

    @Then("^um comprovante de transferencia devera ser apresentado para a chave email do beneficiario$")
    public void um_comprovante_de_transferencia_devera_ser_apresentado_para_a_chave_email_do_beneficiario() throws IOException {

        print.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix E-mail", "7Comprovante transferencia1");
        scroll.scrollVertical();
        print.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix E-mail", "8Comprovante transferencia2");


    }
}
