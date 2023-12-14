package execucao.teste.paginas.login.home.conta;


import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.BasePaginas;


/**
 * Classe responsável pelos elementos na tela conta
 * CT-3x
 *
 * @author Willian Araujo
 */
public class ElementosTelaInicialConta extends BasePaginas {

    /**
     * Metodo responsavel por visualizar ou ocultar o saldo na tela inicial conta
     *
     * @throws Exception
     */
    public static void btnVisualizarSaldoConta() throws Exception {

        //Clicar no botao visualizar ou ocultar saldo
        BaseDados.elementos("5", "2", "2", "0", "0", "2");

    }

    /**
     * Metodo responsavel por clicar no botao Pagar na tela inicial conta e validar elemento contido na pagina pagar
     *
     * @throws Exception
     */
    public static void btnPagar() throws Exception {

        //Clicar no botao Pagar
        BaseDados.elementos("5", "2", "4", "0", "0", "2");

        //Validar elemento na pagina Pagar
        BaseDados.elementos("13", "2", "1", "0", "0", "3");



    }

    public static void btnExtrato() throws Exception {

        //Clicar no botao Extrato
        BaseDados.elementos("5", "2", "3", "0", "0", "2");

        //Validar elemento na pagina Extrato detalhado
        BaseDados.elementos("12", "2", "3", "0", "0", "3");


    }

    public static void btnTrazerMeuSalario() throws Exception {

        //Clicar no botao TrazerMeuSalario
        BaseDados.elementos("5", "2", "8", "0", "0", "2");

        //Validar elemento na pagina trazer meu salario
        BaseDados.elementos("17", "2", "1", "0", "0", "3");



    }

    public static void scrollBtnTransferir() throws Exception {

        //Scroll para deixar botao Receber visivel
        BaseDados.elementos("1", "0", "4", "1", "0", "1");

    }

    public static void btnTransferir() throws Exception {

        //Clicar no botao Transferir
        BaseDados.elementos("5", "2", "7", "0", "0", "2");

        //Validar elemento na pagina de transferencia
        BaseDados.elementos("16", "2", "1", "0", "0", "3");



    }

    public static void scrollBtnReceber() throws Exception {

        //Scroll para deixar botao Receber visivel
        BaseDados.elementos("1", "0", "4", "1", "0", "1");

    }

    public static void btnReceber() throws Exception {

        //Clicar no botao Receber
        BaseDados.elementos("5", "2", "5", "0", "0", "2");

        //Validar elemento tela Receber
        BaseDados.elementos("14", "2", "1", "0", "0", "3");


    }

    public static void scrollBtnSacar() throws Exception {

        //Scroll para deixar botao Sacar visivel
        BaseDados.elementos("1", "0", "5", "1", "0", "1");


    }

    public static void btnSacar() throws Exception {


        //Clicar no botao Sacar
        BaseDados.elementos("5", "2", "6", "0", "0", "2");

        //Botao permissao localizacao
        BaseDados.elementos("2", "2", "3", "0", "0", "2");

        //Bota permissao fotos e midias
        BaseDados.elementos("2", "2", "5", "0", "0", "2");

        //Validar elemento tela saque digial
        BaseDados.elementos("15", "2", "1", "0", "0", "3");


    }

    public static void btnPix() throws Exception {

        //Clicar no botao Pix
        BaseDados.elementos("5", "2", "1", "0", "0", "2");

        //Validar elemento tela area pix
        BaseDados.elementos("18", "2", "1", "0", "0", "3");

    }

    public static void btnOpenFinance() throws Exception {

        //Clicar no botao Open Finance
        BaseDados.elementos("5", "2", "9", "0", "0", "2");

        //Validar elemento tela Open Finance
        BaseDados.elementos("19", "2", "1", "0", "0", "3");

    }


}
