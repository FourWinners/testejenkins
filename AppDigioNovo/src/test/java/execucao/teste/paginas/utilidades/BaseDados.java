package execucao.teste.paginas.utilidades;

import execucao.teste.Driver;
import io.appium.java_client.MobileBy;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class BaseDados {

    private static WebElement ultimoElemento;

    /**
     *
     * Metodo para pegar dados da tabela
     * @author Paulo Lima
     * @param aba
     * @param coluna
     * @param linha
     * @param action
     * @return
     * @throws Exception
     */
    public static String elementos(String aba, String coluna, String linha, String textoScroll, String instancia, String action) throws Exception {

        // Inicializar o objeto Workbook
        Workbook workbook = WorkbookFactory.create(new File("src/test/resources/MassaDados/BaseElements.xlsx"));

        // Obter a primeira planilha (worksheet)
        Sheet sheet = workbook.getSheetAt(Integer.parseInt(aba));

        // Definir os índices da coluna e da linha desejados
        int valorColuna = Integer.parseInt(coluna);
        int valorLinha = Integer.parseInt(linha);
        int valortextoScroll = Integer.parseInt(textoScroll);
        int valorinstancia = Integer.parseInt(instancia);

        // Obter a linha desejada
        Row row = sheet.getRow(valorLinha);
        Row row2 = sheet.getRow(valorinstancia);

        // Verificar se a linha não está vazia
        if (row != null && row2 != null) {

            // Obter o valor da célula como uma string ou numérico (conforme necessário)
            String xpath;
            String textoElemento;

            Cell cell = row.getCell(valorColuna);
            Cell cell2 = row.getCell(valortextoScroll);

            if (cell != null) {
                switch (cell.getCellType()) {
                    case STRING:
                        xpath = cell.getStringCellValue();

                        break;
                    case NUMERIC:
                        xpath = String.valueOf((int) cell.getNumericCellValue());

                        break;
                    default:
                        throw new IllegalStateException("Tipo de célula não suportado: " + cell.getCellType());
                }

                if (cell2 != null) {

                }
                    switch (cell2.getCellType()) {
                        case STRING:
                            textoElemento = cell2.getStringCellValue();
                            break;
                        case NUMERIC:
                            textoElemento = String.valueOf((int) cell2.getNumericCellValue());
                            break;
                        default:
                            throw new IllegalStateException("Tipo de célula não suportado: " + cell2.getCellType());
                }

                // Faça qualquer operação com o elemento aqui
                if ("0".equals(action)) {


                    Actions actions = new Actions(Driver.getDriver());
                    actions.sendKeys(xpath).perform();


                }
                //Para validacao elemento visivel na tela
                else if ("3".equals(action)){

                    ultimoElemento = new WebDriverWait(Driver.getDriver(), 30)
                            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                }
                //Scroll horizontal
                else if ("1".equals(action)) {

                    Driver.getDriver().findElement(MobileBy.AndroidUIAutomator(
                                    String.format("new UiScrollable(new UiSelector().scrollable(true).instance(%s)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\"%s\"));", xpath, textoElemento)))
                            .isDisplayed();


                }else {

                    ultimoElemento = new WebDriverWait(Driver.getDriver(), 20)
                            .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                    ultimoElemento.click();

                }

            }
        }

        // Fechar o workbook ao finalizar
        workbook.close();
        return null;
    }
}

