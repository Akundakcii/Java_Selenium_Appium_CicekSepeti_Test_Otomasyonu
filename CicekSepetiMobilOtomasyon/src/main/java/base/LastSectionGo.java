package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import static links.Linkler.*;

import java.util.List;

public class LastSectionGo extends BasePage {
    public LastSectionGo(AppiumDriver driver) {
        super(driver);
    }

    public LastSectionGo LetsGo() {

        getLastSection().get(0).click();
        waitSec(2);
        getSections().get(1).click();
        waitSec(2);
        getLastSections().get(1).click();
        click(sepeteEkleLocator, 2);
        click(productsOwnerGo, 2);
        getLastSections().get(0).click();
        waitSec(2);
        click(sepeteEkleLocator, 2);

        return this;
    }

    private List<WebElement> getLastSection() {

        return findAll(lastSection);
    }

    private List<WebElement> getSections() {

        return findAll(productSection);
    }

    private List<WebElement> getLastSections() {

        return findAll(Products);
    }
}
