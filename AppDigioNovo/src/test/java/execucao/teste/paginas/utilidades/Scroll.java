package execucao.teste.paginas.utilidades;

import execucao.teste.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileBy;

public class Scroll {

    public static void scrollVertical()  {

        // Criar uma instância da classe TouchAction
        TouchAction touchAction = new TouchAction(Driver.getDriver());

        touchAction.press(PointOption.point(729, 1900)).moveTo(PointOption.point(725, 255)).release().perform();

    }

    public void scrollHorizontal() throws InterruptedException {

        Driver.getDriver()
                .findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(1)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\"Receber\"));")).isDisplayed();
    }
}
