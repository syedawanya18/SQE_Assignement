import org.openqa.selenium.WebDriver;

public class Main {
    public static String path = "src\\driver\\chromedriver.exe";
    public static WebDriver driver;
    public static String link = "https://www.saucedemo.com/";
    public static String Title = "Swag Labs";
    public static String userNameId = "user-name";
    public static String userName = "standard_user";
    public static String password = "secret_sauce";
    public static String passwordId = "password";
    public static String loginid = "login-button";


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello, Website is running please wait");
        login.LaunchChrome(path);
        login.NavigateToURL(link);
        login.TextBox(userNameId,userName);
        login.TextBox(passwordId,password);
        login.Sleep();
        login.LoginClick(loginid);
        login.Sleep();
        productlisting.listingProduct();
        login.LoginClick("add-to-cart-sauce-labs-backpack");
        login.Sleep();
        login.LoginClick("add-to-cart-sauce-labs-bike-light");
        login.Sleep();
        productlisting.listingProduct();
//        productlisting.VerifyProduct("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
//        productlisting.VerifyProduct("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
//        productlisting.VerifyProduct("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
//        productlisting.VerifyProduct("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");
//        productlisting.VerifyProduct("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
//        productlisting.VerifyProduct("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
        String item = productlisting.productSelection("//div[@class='inventory_item_name ']");
        cart.Cart("//a[@class='shopping_cart_link']");
        cart.productVerification("//div[@class='inventory_item_name']",item);
        login.Sleep();

        login.LoginClick("remove-sauce-labs-bike-light");
        login.Sleep();
        cart.VerifyCounter("Sauce Labs Backpack");
        cart.VerifyAmount("$29.99");
        login.LoginClick("checkout");
        login.Sleep();
        login.TextBox("first-name","Wanya");
        login.TextBox("last-name","Sarfaraz");
        login.TextBox("postal-code","75330");
        login.Sleep();
        login.LoginClick("continue");
        login.Sleep();
        login.LoginClick("finish");
        login.Sleep();
        login.LoginClick("back-to-products");
        login.Sleep();
    }
}
