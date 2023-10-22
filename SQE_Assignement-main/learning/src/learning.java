//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.sql.Driver;
//import java.util.List;
//
//public class learning {
//
////    public static WebDriver driver;
////    public static String path = "src\\driver\\chromedriver.exe";
////    public static String argument = "--remote-allow-origins=*";
////    public static String link = "https://www.saucedemo.com/";
////    public static String Title = "Swag Labs";
////    public static String userName = "standard_user";
////    public static String password = "secret_sauce";
////    public static void LaunchChrome (){
////        try {
////            System.setProperty("webdriver.chrome.driver", path);
////            ChromeOptions chromeOptions = new ChromeOptions();
////            chromeOptions.addArguments(argument);
////            driver = new ChromeDriver(chromeOptions);
////            driver.manage().window().maximize();
////        } catch (Exception e) {
////            System.out.println(e);
////        }
////    }
////
////    public static void NavigateToURL(String link){
////        try {
////            driver.get(link);
////        } catch(Exception e) {
////            System.out.println(e);
////        }
////    }
//    public static void VerifyTitle(String expectedTitle){
//        String actualTitle = driver.getTitle();
//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println(
//                    "Title Verification Passed:\n" +
//                            "Expected Title: " + expectedTitle + "\n" +
//                            "Actual Title: " + actualTitle);
//        } else {
//            System.out.println(
//                    "Title Verification Failed:\n" +
//                            "Expected Title: " + expectedTitle + "\n" +
//                            "Actual Title: " + actualTitle);
//        }
//    }
////    public static void UserName(String user_id){
////        WebElement userNameTextBox = driver.findElement(By.id(user_id));
////            userNameTextBox.sendKeys(userName);
////    }
////    public static void Password(String password_id) throws InterruptedException {
////
////            WebElement passwordTextBox = driver.findElement(By.id(password_id));
////            passwordTextBox.sendKeys(password);
////            Thread.sleep(3000);
////    }
////    public static void LoginClick() throws InterruptedException {
////            WebElement logInButton = driver.findElement(By.id("login-button"));
////            logInButton.click();
////            Thread.sleep(3000);
////    }
//    public static void AddtocartClick(String product_name) throws InterruptedException {
//        WebElement AddtocartButton = driver.findElement(By.id(product_name));
//        AddtocartButton.click();
//        Thread.sleep(3000);
//    }
//    public static void Cart() throws InterruptedException {
//        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//        cart.click();
//        Thread.sleep(3000);
//    }
//
//    public static void RemoveItem() throws InterruptedException {
//        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-bike-light"));
//        removeButton.click();
//        Thread.sleep(3000);
//    }
//    public static void VerifyCounter(String expectedResult){
//        List <WebElement> Title = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
//        for (WebElement i : Title){
//            String actualResult = i.getText();
//
//            if (actualResult.equals(expectedResult)) {
//                System.out.print("Counter: ");
//                System.out.println(Title.size());
//                System.out.println(
//                        "Counter Verification Passed:\n" +
//                                "Expected Title: " + expectedResult + "\n" +
//                                "Actual Title: " + actualResult);
//            } else {
//                System.out.println(
//                        "Counter Verification Failed:\n" +
//                                "Expected Title: " + expectedResult + "\n" +
//                                "Actual Title: " + actualResult);
//            }
//        }
//    }
//
//    public static void VerifyAmount(String expectedResult){
//        List <WebElement> Title = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
//        for (WebElement i : Title){
//            String actualResult = i.getText();
//
//            if (actualResult.equals(expectedResult)) {
//
//                System.out.println(
//                        "Amount Verification Passed:\n" +
//                                "Expected Title: " + expectedResult + "\n" +
//                                "Actual Title: " + actualResult);
//            } else {
//                System.out.println(
//                        "Amount Verification Failed:\n" +
//                                "Expected Title: " + expectedResult + "\n" +
//                                "Actual Title: " + actualResult);
//            }
//        }
//    }
//
//
//    public static void Checkout() throws InterruptedException {
//        WebElement CheckoutButton = driver.findElement(By.id("checkout"));
//        CheckoutButton.click();
//        Thread.sleep(3000);
//    }
//    public static void FirstName(String firstName){
//        WebElement userNameTextBox = driver.findElement(By.id("first-name"));
//        userNameTextBox.sendKeys(firstName);
//    }
//    public static void LastName(String lastName){
//        WebElement userNameTextBox = driver.findElement(By.id("last-name"));
//        userNameTextBox.sendKeys(lastName);
//    }
//    public static void PostalCode(String postalcode) throws InterruptedException {
//        WebElement userNameTextBox = driver.findElement(By.id("postal-code"));
//        userNameTextBox.sendKeys(postalcode);
//        Thread.sleep(3000);
//    }
//    public static void ContinueButton() throws InterruptedException {
//        WebElement continueButton = driver.findElement(By.id("continue"));
//        continueButton.click();
//        Thread.sleep(3000);
//
//    }
//
//    public static void FinishButton() throws InterruptedException {
//        WebElement finishButton = driver.findElement(By.id("finish"));
//        finishButton.click();
//        Thread.sleep(3000);
//    }
//    public static void BackhomeButton() throws InterruptedException {
//        WebElement backhomeButton = driver.findElement(By.id("back-to-products"));
//        backhomeButton.click();
//        Thread.sleep(3000);
//    }
//
//
//    public static void main(String[] args) throws Exception {
//        System.out.print("Hello, Website is running please wait");
//
////        LaunchChrome();
////        NavigateToURL(link);
//        VerifyTitle(Title);
////        UserName("user-name");
////        Password("password");
////        LoginClick();
//        AddtocartClick("add-to-cart-sauce-labs-backpack");
//        AddtocartClick("add-to-cart-sauce-labs-bike-light");
//        Cart();
//        RemoveItem();
//        VerifyCounter("Sauce Labs Backpack");
//        VerifyAmount("$29.99");
//        Checkout();
//        FirstName("Wanya");
//        LastName("Sarfaraz");
//        PostalCode("75300");
//        ContinueButton();
//        FinishButton();
//        BackhomeButton();
//
//    }
//
//}
