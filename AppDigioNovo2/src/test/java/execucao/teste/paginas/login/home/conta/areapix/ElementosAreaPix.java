package execucao.teste.paginas.login.home.conta.areapix;

import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.BasePaginas;

/**
 * Classe responsável pelos elementos na tela Area Pix
 * CT-4x
 */
public class ElementosAreaPix extends BasePaginas {


    public static void btnMinhasChaves() throws Exception {

        //Clicar no botao Minhas chaves
        BaseDados.elementos("18", "2", "6", "0", "0", "2");

        //Validar elemento na pagina Minhas chaves
        BaseDados.elementos("21", "2", "1", "0", "0", "3");


    }

    public static void btnTransferir() throws Exception {

        //Clicar no botao Transferir
        BaseDados.elementos("18", "2", "1", "0", "0", "2");

        //Validar elemento na pagina Transferir
        BaseDados.elementos("20", "2", "1", "0", "0", "3");


    }


}
