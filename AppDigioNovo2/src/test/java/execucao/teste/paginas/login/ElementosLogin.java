package execucao.teste.paginas.login;

import execucao.teste.paginas.login.home.cartao.ElementosTelaInicialCartao;
import execucao.teste.paginas.login.home.menu.ElementosMenu;
import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.PrintScreen;
import execucao.teste.paginas.utilidades.BasePaginas;



/**
 * Classe responsavel por realizar o login completo
 */
public class ElementosLogin extends BasePaginas {

    /**
     * Metodo responsavel por permitir cookies, localizacao, camera,
     * inserir massa de dados e evidenciar a massa de dados que sera utilizada no teste.
     *
     * @throws Exception
     */
    public static void login() throws Exception {

        //Botao Prosseguir
        BaseDados.elementos("2", "2", "1", "0", "0", "2");

        //Botao permissao localizacao
        BaseDados.elementos("2", "2", "2", "0", "0", "2");

        //Botao permitir localizacao enquanto utiliza app
        BaseDados.elementos("2", "2", "3", "0", "0", "2");

        //Botao comear
        BaseDados.elementos("2", "2", "4", "0", "0", "2");

        //Incluir cpf
        BaseDados.elementos("0", "1", "3", "0", "0", "0");

        //Evidenciar massa de teste
        PrintScreen.screenshot("", "", "0MassaTeste");

        //Botao proximo
        BaseDados.elementos("3", "2", "2", "0", "0", "2");

    }

    /**
     * Metodo responsavel por inserir senha, evidenciar senha e avancar para autenticacao.
     *
     * @throws Exception
     */
    public static void envioSenha() throws Exception {


//        //Click campo inserir senha
//        BaseDados.elementos("3", "2", "3", "0", "0", "2");
//
//        //Senha
//        BaseDados.elementos("0", "2", "1", "0", "0", "0");

        //Botao Visualizar senha
        BaseDados.elementos("3", "2", "4", "0", "0", "2");

        //Evidencia senha
        PrintScreen.screenshot("", "", "1MassaSenha");

        //Botao entrar
        BaseDados.elementos("3", "2", "5", "0", "0", "2");

    }

    /**
     * Metodo responsavel por fechar anuncio novidade e validar elemento presente na tela home,
     * confirmando o login com sucesso.
     *
     * @throws Exception
     */
    public static void validarHome() throws Exception {


        //Fechar anuncio novidade
        BaseDados.elementos("3", "2", "6", "0", "0", "2");

        //Validar elemento na tela inicial
        BaseDados.elementos("4", "2", "1", "0", "0", "3");

        //Evidencia versao do app
        ElementosTelaInicialCartao.btnMenu();
        ElementosMenu.btnVersaoApp();

    }

}

