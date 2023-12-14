package execucao.teste.etapas.login.home.conta.areapix.transferenciapix;

import cucumber.api.java.en.*;
import execucao.teste.paginas.login.home.conta.areapix.transferenciapix.ElementosTransferenciaPorPix;
import execucao.teste.paginas.utilidades.PrintScreen;

import java.io.IOException;

/**
 * Classe responsavel por validar uma transferencia via pix utilizando chave CPF
 * CT-5001
 */
public class BtnChaveCpf {

    @When("^escolher o tipo chave CPF$")
    public void escolher_o_tipo_chave_CPF() throws Exception {

        PrintScreen.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix por CPF", "3 - Area Transferencia por pix");
//        ElementosTransferenciaPorPix.opcaoCPF();

    }

    @And("^realizar uma transferencia pix$")
    public void realizar_uma_transferencia_pix() throws Exception {

        ElementosTransferenciaPorPix.envioChaveTransferenciaCpf();
//        PrintScreen.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix por CPF", "4 - Massa beneficiario");
//        ElementosTransferenciaPorPix.btnContinuar();
//        ElementosTransferenciaPorPix.envioValorTransferirPix();
//        PrintScreen.screenshot("Transferencia por Pix", "Validar transferencia chave valida pix por CPF", "5 - Valor transferencia");
//        ElementosTransferenciaPorPix.ContinuarAvisoParcelamento();

//        PrintScreen.screenshot("Transferencia por Pix","Validar transferencia chave valida pix por CPF","6 - Limite antes e tipo de transferencia");
//        ElementosTransferenciaPorPix.btnPagarComSaldo();
//        PrintScreen.screenshot("Transferencia por Pix","Validar transferencia chave valida pix por CPF","7 - Revisao transferencia");
//        ElementosTransferenciaPorPix.btnElementosTransferenciaPorPix();
//        senha.envioSenhaPix();

    }

    @And("^a transacao for aprovada$")
    public void a_transacao_for_aprovada() throws IOException {

//        PrintScreen.screenshot("Transferencia por Pix","Validar transferencia chave valida pix por CPF","6Transferencia enviada");
//        ElementosTransferenciaPorPix.btnAcessarComprovante();


    }

    @Then("^devera ser apresentado um comprovante de transferencia para o cpf do beneficiaria$")
    public void devera_ser_apresentado_um_comprovante_de_transferencia_para_o_cpf_do_beneficiaria() throws IOException {
//
//        PrintScreen.screenshot("Transferencia por Pix","Validar transferencia chave valida pix por CPF","7Comprovante transferencia1");
//        scroll.scrollVertical();
//        PrintScreen.screenshot("Transferencia por Pix","Validar transferencia chave valida pix por CPF","8Comprovante transferencia2");

    }

}
