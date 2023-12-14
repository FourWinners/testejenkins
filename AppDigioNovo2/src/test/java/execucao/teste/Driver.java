package execucao.teste;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AppiumDriver<?> driver;

    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appPackage", "br.com.digio.homol");
        capabilities.setCapability("appActivity", "br.com.digio.newarchitecture.ui.splash.activity.SplashActivity");
        capabilities.setCapability("deviceName", "1d7430950405");
        capabilities.setCapability("platformName", "Android 11");


        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }

    public static AppiumDriver<?> getDriver() {

        return driver;

    }


//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }


    //CONEXAO APP
    @Before
    public static void startProject() throws MalformedURLException {
        if (getDriver() != null) {
            getDriver().launchApp();
        } else {
            validateDriver();

        }
    }
}





