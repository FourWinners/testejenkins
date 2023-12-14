package execucao.teste.paginas.login.home.cartao;


import execucao.teste.paginas.utilidades.BaseDados;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Classe responsável pelos elementos na tela inicial
 */
public class ElementosTelaInicialCartao {


	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"br.com.digio.homol.main:id/imageView_menu_hamburger\"]")
	private static RemoteWebElement btnMenu;

	/**
	 * Metodo para acessa area conta ou cartao na tela inicial
	 */
	public static void btnContaCartao() throws Exception {

		//Clicar botao ContaCartao
		BaseDados.elementos("4","2","3","0","0","2");

		//Validar pagina area conta
		BaseDados.elementos("5","2","1","0","0","3");

	}

	/**
	 * Metodo para visualizar ou ocultar saldo disponivel em cartao
	 */
	public static void btnVisualizarSaldoCartao() throws Exception {

		BaseDados.elementos("4","2","3","0","0","2");

	}

	/**
	 * Metodo para acessar tela Menu
	 * @throws Exception
	 */
	public static void btnMenu() throws Exception {

		//Clicar no botao Menu
		BaseDados.elementos("4","2","4","0","0","2");

		//Validar pagina Menu
		BaseDados.elementos("6","2","1","0","0","3");

	}

	/**
	 * Metodo para clicar no botao Pagar fatura na tela inicial cartao
	 * @throws Exception
	 */
	public static void BtnPagarFatura() throws Exception {

		//Clicar no botao Pagar fatura
		BaseDados.elementos("4","2","5","0","0","2");

		//Validar elemento tela Pagar fatura
		BaseDados.elementos("7","2","1","0","0","3");

	}

	/**
	 * Metodo responsavel por acessar area Meus cartoes pela tela inicial cartao
	 * @throws Exception
	 */
	public static void btnMeusCartoes() throws Exception {

		//Clicar no botao MeusCartoes
		BaseDados.elementos("4","2","6","0","0","2");

		//Validar elemento tela Meus cartoes
		BaseDados.elementos("8","2","1","0","0","3");

	}

	/**
	 * Metodo responsavel por realizar o scroll ate o botao Resumo da fatura ficar visivel.
	 * @throws Exception
	 */
	public static void scrolResumoFaturaEVencimento() throws Exception {

		//Scroll para deixar botao Resumo da fatura/Vencimento visivel
		BaseDados.elementos("1","0","1","1","0","1");

	}

	/**
	 * Metodo responsavel por clicar e validar  o resumo da fatura a partir da tela inicial Cartao.
	 * @throws Exception
	 */
	public static void btnResumoFatura() throws Exception {

		//Clicar no botao Pagar fatura
		BaseDados.elementos("4","2","7","0","0","2");

		//Validar elemento tela resumo da fatura
		BaseDados.elementos("9","2","1","0","0","3");

	}

	public static void btnVencimento() throws Exception {

		//Clica no botao Vencimento
		BaseDados.elementos("4","2","8","0","0","2");

		//Validar elemento tela Vencimento
		BaseDados.elementos("10","2","1","0","0","3");

	}

	public static void scrollDebitoAutomatico() throws Exception {

		//Scroll para deixar botao Debito automatico visivel
		BaseDados.elementos("1","0","3","1","0","1");

	}
	public static void btnDebitoAutomatico() throws Exception {

		BaseDados.elementos("4","2","9","1","0","2");

		//Validar elemento tela Vencimento
		BaseDados.elementos("11","2","1","0","0","3");

	}

	public static void btnAntecipeFgts() throws Exception {

		//Clica no botao Antecipe Fgts
		BaseDados.elementos("4","2","10","0","0","2");

		//Validar elemento tela servicos Fgts
		BaseDados.elementos("22","2","1","0","0","3");

	}

	public static void btnGranaExtra() throws Exception {

		//Clica no botao Grana Extra
		BaseDados.elementos("4","2","11","0","0","2");

		//Validar elemento tela Grana Extra
		BaseDados.elementos("23","2","1","0","0","3");

	}

	public static void scrollOpenFinance() throws Exception {

		//Scroll para deixar botao Loja e Open Finance visiveis
		BaseDados.elementos("1","0","7","1","0","1");

	}

	public static void btnLoja() throws Exception {

		//Clica no botao Loja
		BaseDados.elementos("4","2","11","0","0","2");

		//Validar elemento na tela DigioLoja
		BaseDados.elementos("24","2","2","0","0","3");

	}

	public static void btnOpenFinanceCartao() throws Exception {

		//Clica no botao Open Finance
		BaseDados.elementos("4","2","11","0","0","2");

		//Validar elemento na tela Open Finance
		BaseDados.elementos("19","2","1","0","0","3");

	}

	public static void btnJogaNoDigio() throws Exception {

		//Clica no botao Open Finance
		BaseDados.elementos("4","2","14","0","0","2");

		//Validar elemento na tela Open Finance
		BaseDados.elementos("25","2","1","0","0","3");

	}

	public static void btnMeuLimite () throws Exception {

		//Clica no botao Meu Limite
		BaseDados.elementos("4","2","15","0","0","2");

		//Validar elemento na tela Ajuste limite
		BaseDados.elementos("26","2","1","0","0","3");

	}

	public static void btnMinhasCompras() throws Exception {

		//Clica no botao Meu Limite
		BaseDados.elementos("4","2","16","0","0","2");

		//Validar elemento na tela Ajuste limite
		BaseDados.elementos("27","2","1","0","0","3");


	}
}

