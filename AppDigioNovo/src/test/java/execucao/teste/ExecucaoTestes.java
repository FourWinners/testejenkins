package execucao.teste;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // RELATORIOS
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"},

        // CAMINHO OS CASOS DE TESTES
        features = "src/test/resources/Funcionalidades/",

//         TAGS PARA RODAR OS TESTES
        tags = {"@extrato,@extrato1"},

        // CAMINHO PACOTE DO TESTE DE EXECUÇÃO
        glue = {"execucao.teste"},

        monochrome = true


)

/**
 * Classe responsavel por executar as etapas
 */
public class ExecucaoTestes {

//	@AfterClass
//	public static void fecharApp() {
//		Driver.quitDriver();
//	}
}