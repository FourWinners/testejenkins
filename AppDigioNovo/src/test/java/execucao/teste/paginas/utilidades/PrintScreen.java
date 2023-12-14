package execucao.teste.paginas.utilidades;

import execucao.teste.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


/**
 * Classe responsavel por gerar printscreen
 *
 * @author Paulo Lima
 */
public class PrintScreen {

    /**
     * Metodo responsavel por gerar printscreen
     *
     * @author Paulo Lima
     */
    public static void screenshot(String featureName, String scenarioName, String fileName) throws IOException {
        // Construir o caminho do arquivo com base na feature, no cenário e no nome do arquivo
        String filePath = "target/evidencias/" + featureName + "/" + scenarioName + "/" + fileName + ".png";

        // Capturar o screenshot e salvar no caminho construído
        File print = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(print, new File(filePath));

        // Criar o diretório se não existir
        File directory = new File(FileUtils.getTempDirectoryPath() + "/" + featureName + "/" + scenarioName);
        if (!directory.exists()) {
            directory.mkdirs();  // Cria os diretórios recursivamente, se necessário
        }
    }

}
