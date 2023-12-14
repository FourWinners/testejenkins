package execucao.teste.paginas.utilidades;

import execucao.teste.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnvioSenhaTransferenciaPix {



    ElementosUtilidades util = new ElementosUtilidades();

    public void envioSenhaPix() throws InterruptedException {
        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 20);
        WebElement envioSenhaPix = wait1
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By
                                .xpath("(//android.widget.EditText[@resource-id=\"br.com.digio.homol:id/inputText\"])[1]")));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("2541").perform();

        util.btnContinuar();
        Thread.sleep(8050);


    }
}
