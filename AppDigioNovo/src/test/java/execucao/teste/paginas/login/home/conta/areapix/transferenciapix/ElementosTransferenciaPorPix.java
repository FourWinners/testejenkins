package execucao.teste.paginas.login.home.conta.areapix.transferenciapix;

import execucao.teste.Driver;
import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.BasePaginas;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Classe responsável pelos elementos na tela Area Pix
 * CT-5x
 */
public class ElementosTransferenciaPorPix extends BasePaginas {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"br.com.digio.homol:id/pixInstallmentsOrSightSightTitle\" or @text='Pagar com saldo da conta']")
    private RemoteWebElement btnPagarComSaldo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"br.com.digio.homol:id/text\" or @text='Transferir']")
    private RemoteWebElement btnTransferir;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"br.com.digio.homol:id/fragment_receipt_toolbar_close\"]")
    private RemoteWebElement btnFecharComprovante;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"br.com.digio.homol:id/item_menu_pix_title\" and @text=\"Telefone\"]")
    private RemoteWebElement opcaoTelefone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Endereço E-mail']")
    private RemoteWebElement opcaoEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chave aleatória']")
    private RemoteWebElement opcaoChaveAleatoria;


    public static void opcaoCPF() throws Exception {

        //Clicar no botao CPF / CNPJ
        BaseDados.elementos("20", "2", "2", "0", "0", "2");

    }
    public void opcaoEmail(){

        opcaoEmail.click();

    }

    public void opcaoChaveAleatoria(){

        opcaoChaveAleatoria.click();

    }
    public void opcaoTelefone(){

        opcaoTelefone.click();

    }

    public static void envioChaveTransferenciaCpf() throws Exception {

        BaseDados.elementos("0","0","0","0","0","0");


    }

    public static void btnContinuar() throws Exception {

        BaseDados.elementos("20","2","8","0","0","0");

    }

    public static void ContinuarAvisoParcelamento() throws Exception {

        BaseDados.elementos("20","2","9","0","0","0");


    }

    public static void envioValorTransferirPix() throws Exception {

        BaseDados.elementos("20","7","1","0","0","0");

    }

    public void btnPagarComSaldo(){

        btnPagarComSaldo.click();

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 20);
        WebElement revisaoTransferencia = wait1
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"br.com.digio.homol:id/title\" and @text='Revise sua transferência']")));



    }

    public void btnTransferir(){

        btnTransferir.click();

    }

public static void btnAcessarComprovante(){

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    WebElement btnAcessarComprovante = wait
            .until(ExpectedConditions
                    .elementToBeClickable(By.xpath("//android.widget.TextView[@text='Acessar comprovante']")));

    btnAcessarComprovante.click();

    //Validar elemento na tela comprovante de transferencia
    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 20);
    WebElement comprovanteTransferencia = wait1
            .until(ExpectedConditions
                    .elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"br.com.digio.homol:id/fragment_receipt_label_title_copy_transaction\" and @text='Código da transação']")));

}

    public void btnFecharComprovante(){

        btnFecharComprovante.click();

    }



}
