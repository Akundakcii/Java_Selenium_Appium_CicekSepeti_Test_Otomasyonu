package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static links.Linkler.*;

public class GotoBasket extends BasePage {
    AppiumDriver driver;

    public GotoBasket(AppiumDriver driver) {
        super(driver);
    }

    public GotoBasket sepet() {
        click(sepeteEkleLocator, 2);

        getAllBeden().get(1).click();
        click(sepeteEkle2, 2);
        write(adressLocator, "Balıkesir", 2);
        getAdress().get(0).click();
//click(productsAdd,2);
        click(deleteProducts, 2);
        click(deleteOnayla, 2);
        click(alisveriseBasla, 2);


        return this;
    }

    private List<WebElement> getAllBeden() {
        return findAll(bedenSelect);

    }

    private List<WebElement> getAdress() {
        return findAll(selectAdress);

    }


}
