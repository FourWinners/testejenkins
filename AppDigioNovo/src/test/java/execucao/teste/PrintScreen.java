package execucao.teste;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class PrintScreen {
	

	// EVIDENCIAR MASSA PARA TESTE
	public void printLogin() throws IOException {

		File printLogin = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(printLogin, new File("target/evidencias/printLogin.png"));

	}

	public void printLogin1() throws IOException {

		File printLogin1 = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(printLogin1, new File("target/evidencias/printLogin1.png"));

	}




}
