package execucao.teste.paginas.utilidades;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import execucao.teste.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;



public class ElementosUtilidades extends BasePaginas{


	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Finalizar']")
	private RemoteWebElement btnFinalizar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continuar']")
	private RemoteWebElement btnContinuar;


	public void envioSenha () throws InterruptedException {


		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 60);
		WebElement envioSenha = wait1
				.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Digite a senha do cartão\"]")));

		Actions actions = new Actions(Driver.getDriver());
		actions.sendKeys("2541").perform();

	}



    public void envioChaveEmail () {

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 60);
        WebElement envioChaveEmail= wait1
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='E-mail']")));

        envioChaveEmail.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("kguerra.4win@digio.com.br").perform();

    }

    public void envioChaveAleatoria(){

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 60);
        WebElement envioChaveAleatoria= wait1
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//android.widget.TextView[@text='Chave aleatória']")));

        envioChaveAleatoria.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("0c04cff9-4689-4b92-9c7a-4f2b083bccbd").perform();

    }


    public void envioTelefone(){

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 60);
        WebElement envioChaveTelefone= wait1
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//android.widget.TextView[@text='Telefone']")));

        envioChaveTelefone.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("11999010416").perform();


    }
	public void btnContinuar() throws InterruptedException {
		
		btnContinuar.click();
        Thread.sleep(2000);

	}

}
