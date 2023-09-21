package ciceksepeti;

import base.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OtoCicekS extends BaseTest {
    GirisPage girisPage;
    ProductsSearch productsSearch;
    GotoBasket gotoBasket;
    MenuSelection menuSelection;
    LastSectionGo lastSectionGo;

    @BeforeClass
    public void before() {
        girisPage = new GirisPage(getAppiumDriver());
        productsSearch = new ProductsSearch(getAppiumDriver());
        gotoBasket = new GotoBasket(getAppiumDriver());
        menuSelection = new MenuSelection(getAppiumDriver());
        lastSectionGo = new LastSectionGo(getAppiumDriver());

    }

    @Test
    public void test() {
        girisPage
                .giris("BURAYA CİCEK SEPETİ KAYITLI EPOSTA GİRİNİZ", "BURAYA CİCEK SEPETİ KAYITLI EPOSTANIZA TANIMLI SİFRENİZİ GİRİNİZ");

    }

    @Test
    public void test2() {
        productsSearch
                .ProductSearchL("Bot"); // ARATMAK İSTEDİĞİNİZ ÜRÜNÜ GİRİNİZ


    }

    @Test
    public void test3() {
        gotoBasket
                .sepet();

    }

    @Test
    public void test4() {
        menuSelection
                .MenuGezmek();
    }

    @Test
    public void test5() {
        lastSectionGo
                .LetsGo();

    }
}
