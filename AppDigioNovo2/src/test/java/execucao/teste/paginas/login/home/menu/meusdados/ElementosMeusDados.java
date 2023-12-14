package execucao.teste.paginas.login.home.menu.meusdados;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ElementosMeusDados {


    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"br.com.digio.homol:id/menuItems\"]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.LinearLayout")
    private RemoteWebElement btnMeusDados;


}
