package execucao.teste.paginas.login.home.menu;

import execucao.teste.Driver;
import execucao.teste.paginas.utilidades.BaseDados;
import execucao.teste.paginas.utilidades.BasePaginas;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementosMenu extends BasePaginas {

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"br.com.digio.homol:id/menuItems\"]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.LinearLayout")
    private RemoteWebElement btnMeusDados;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"br.com.digio.homol:id/menuItems\"]/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.LinearLayout")
    private RemoteWebElement btnMinhaConta;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"br.com.digio.homol:id/menuItems\"]/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.LinearLayout")
    private RemoteWebElement btnMeuCartao;

    public static void btnMeusDados() throws Exception {

        //Clicar no botao Open Finance
        BaseDados.elementos("5", "2", "9", "0", "0", "2");

        //Validar elemento tela Open Finance
        BaseDados.elementos("19", "2", "1", "0", "0", "3");

    }

    public void btnMinhaConta() {

        btnMinhaConta.click();

        //Validar elemento secao Minha conta
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        WebElement validarSecaoMinhaConta = wait
                .until(ExpectedConditions
                        .elementToBeClickable(By
                                .xpath("//android.widget.TextView[@text='Débito automático']")));

    }

    public void btnMeuCartao() {

        btnMeuCartao.click();

        //Validar elemento secao Meu cartao
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        WebElement validarSecaoMeuCartao = wait
                .until(ExpectedConditions
                        .elementToBeClickable(By
                                .xpath("//android.widget.TextView[@text='Alterar vencimento']")));

    }

    public static void btnVersaoApp() throws Exception {

        //Clicar no botao versao do aplicativo
        BaseDados.elementos("6", "2", "3", "0", "0", "2");

        //Validar elemento versao
        BaseDados.elementos("28", "2", "1", "0", "0", "3");

    }
    public static void btnFecharMenu() throws Exception {

        //Clicar no botao fechar Menu
        BaseDados.elementos("6", "2", "3", "0", "0", "2");

        //Validar elemento na tela inicial
        BaseDados.elementos("4", "2", "1", "0", "0", "3");

    }
}
