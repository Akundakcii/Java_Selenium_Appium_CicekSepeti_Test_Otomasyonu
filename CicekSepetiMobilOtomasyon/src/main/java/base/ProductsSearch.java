package base;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import java.util.List;

import static links.Linkler.*;

public class ProductsSearch extends BasePage {
    public ProductsSearch(AppiumDriver driver) {
        super(driver);
    }

    public ProductsSearch ProductSearchL(String urun) {


        click(kategoriLocator, 2);
        click(getSearcBoxLocator, 2);
        write(searchBoxLocator, urun, 2);
        getAllMenu().get(2).click();
        waitSec(2);
        getAllProducts().get(2).click();
        waitSec(2);


        return this;
    }

    private List<WebElement> getAllMenu() {
        return findAll(selectProducts);
    }

    private List<WebElement> getAllProducts() {
        return findAll(Products);
    }


}
