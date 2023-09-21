package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    static AppiumDriver appiumDriver = null;
    public static WebDriverWait wait;

    @BeforeClass
    public void setup() {

        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "Pixel 7 API 33");
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformVersion", "13.0");
            cap.setCapability("appPackage", "com.ciceksepeti.ciceksepeti");
            cap.setCapability("appActivity", "com.ciceksepeti.ciceksepeti.home.HomeActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "false");

            appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

            wait = new WebDriverWait(appiumDriver, 10);


        } catch (MalformedURLException mx) {
            System.out.println("URL HATASI TEKRAR KONTROL EDİN");


        }

    }

    public static AppiumDriver getAppiumDriver() {

        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTest.appiumDriver = appiumDriver;
    }

    @AfterClass
    public void tearDown() {
        getAppiumDriver().quit();
    }


}
