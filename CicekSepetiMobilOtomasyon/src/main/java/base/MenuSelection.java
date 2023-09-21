package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static links.Linkler.*;

public class MenuSelection extends BasePage {
    public MenuSelection(AppiumDriver driver) {
        super(driver);
    }

    public MenuSelection MenuGezmek() {

        click(kategoriLocator, 2);

        click(saveBackProducts, 2);
        click(kategoriLocator, 2);

        for (int i = 0; i < getLeftMenu().size(); i++) {

            getLeftMenu().get(i).click();
            if (getLeftMenu().get(5).isSelected()) {

                TouchAction swipe = new TouchAction(driver);
                swipe.press(PointOption.point(228, 2027));
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
                swipe.moveTo(PointOption.point(223, 731));
                swipe.release();
                swipe.perform();


            }


        }


        return this;

    }

    private List<WebElement> getLeftMenu() {

        return findAll(leftBarMenu);
    }
}
