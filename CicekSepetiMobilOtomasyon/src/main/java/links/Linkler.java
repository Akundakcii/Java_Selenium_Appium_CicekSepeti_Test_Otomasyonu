package links;

import org.openqa.selenium.By;

public class Linkler {

    public static final By hediyeLocator = By.id("com.ciceksepeti.ciceksepeti:id/rightImage");
    public static final By hesabimLocator = new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.widget.FrameLayout/android.widget.ImageView");
    public static final By uyeGirisLocator = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]");

    public static final By epostaGirsLocatorText = By.id("com.ciceksepeti.ciceksepeti:id/email");
    public static final By sifreGirsLocatorText = By.id("com.ciceksepeti.ciceksepeti:id/password");
    public static final By GirisButtonLocator = By.id("com.ciceksepeti.ciceksepeti:id/login");
    public static final By AnasayfaLocator = new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]/android.widget.FrameLayout/android.widget.ImageView");
//////////// GirisBitti

    ///Ürün Aratma

    public static final By kategoriLocator = new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView");
    //  public static final By searcBoxLocator = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
    public static final By getSearcBoxLocator = By.id("com.ciceksepeti.ciceksepeti:id/search_src_text");
    public static final By searchBoxLocator = new By.ByClassName("android.widget.AutoCompleteTextView");
    public static final By selectProducts = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout");
    public static final By Products = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat");

////
    ///Sepete Ekle

    public static final By sepeteEkleLocator = By.id("com.ciceksepeti.ciceksepeti:id/addCart");
    public static final By bedenSelect = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView");

    public static final By adressLocator = new By.ByClassName("android.widget.EditText");
    public static final By selectAdress = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView");

    public static final By sepeteEkle2 = By.id("com.ciceksepeti.ciceksepeti:id/addCartFeature");
    //  public static final By productsAdd = By.id("com.ciceksepeti.ciceksepeti:id/btnIncrease");
    public static final By deleteProducts = By.id("com.ciceksepeti.ciceksepeti:id/delete");
    public static final By deleteOnayla = By.id("android:id/button2");
    public static final By alisveriseBasla = By.id("com.ciceksepeti.ciceksepeti:id/button");


/////
    //Memu Selection

    //kategoriLocator Cek

    public static final By saveBackProducts = By.id("com.ciceksepeti.ciceksepeti:id/imgBack");
    public static final By leftBarMenu = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout");

    /////
    ///Son Kalan yerden Devam
    public static final By lastSection = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout");
    public static final By productSection = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout/android.widget.GridView/androidx.cardview.widget.CardView");

    //sepete ekele Locator
    public static final By productsOwnerGo = By.id("com.ciceksepeti.ciceksepeti:id/tvShopName");
//sepete ekle locator


}
