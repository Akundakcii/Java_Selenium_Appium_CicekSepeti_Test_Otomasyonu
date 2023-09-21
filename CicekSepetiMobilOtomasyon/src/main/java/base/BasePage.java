package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    AppiumDriver driver;
    WebDriverWait wait;


    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);

    }

    public void waitSec(int saniye) {
        driver.manage().timeouts().implicitlyWait(saniye, TimeUnit.SECONDS);
    }

    public WebElement find(By Locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public void write(By Locator, String text, int i) {
        find(Locator).sendKeys(text);
        waitSec(i);

    }

    public void click(By Locator, int i) {

        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        find(Locator).click();
        waitSec(i);
    }

    public List<WebElement> findAll(By Locator) {

        return driver.findElements(Locator);
    }

    public void write(By Locator, String text) {
        find(Locator).sendKeys(text);

    }
}