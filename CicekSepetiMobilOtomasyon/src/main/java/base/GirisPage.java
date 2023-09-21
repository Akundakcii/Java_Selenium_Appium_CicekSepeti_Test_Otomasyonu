package base;

import io.appium.java_client.AppiumDriver;

import static links.Linkler.*;

public class GirisPage extends BasePage {
    AppiumDriver driver;

    public GirisPage(AppiumDriver driver) {
        super(driver);
    }

    public GirisPage giris(String eposta, String sifre) {
        click(hediyeLocator, 2);
        click(hesabimLocator, 2);
        click(uyeGirisLocator, 2);
        write(epostaGirsLocatorText, eposta, 2);
        write(sifreGirsLocatorText, sifre, 2);
        click(GirisButtonLocator, 2);
        click(AnasayfaLocator, 2);


        return this;
    }
}
