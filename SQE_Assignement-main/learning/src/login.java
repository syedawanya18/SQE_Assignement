import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
    public static void LaunchChrome (String path){
        try {
            System.setProperty("webdriver.chrome.driver", path);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(chromeOptions);
            Main.driver = driver;
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void NavigateToURL(String link){
        try {
            Main.driver.get(link);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void TextBox(String textbox_id, String key){

        WebElement userNameTextBox = Main.driver.findElement(By.id(textbox_id));
        userNameTextBox.sendKeys(key);
    }
    public static void LoginClick(String loginid) throws InterruptedException {
        WebElement logInButton = Main.driver.findElement(By.id(loginid));
        logInButton.click();
    }

    public static void Sleep() throws InterruptedException {
        Thread.sleep(3000);
    }
}
