import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class cart {
//    public static void AddtocartClick(String product_name) throws InterruptedException {
//        WebElement AddtocartButton = Main.driver.findElement(By.id(product_name));
//        ((WebElement) AddtocartButton).click();
//    }

    public static void Cart(String xpath) throws InterruptedException {
        WebElement cart = Main.driver.findElement(By.xpath(xpath));
        cart.click();
    }
//    public static void RemoveItem() throws InterruptedException {
//        WebElement removeButton = Main.driver.findElement(By.id("remove-sauce-labs-bike-light"));
//        removeButton.click();
//    }
public static void productVerification(String xpath,String expectedResult) {

    WebElement item = Main.driver.findElement(By.xpath(xpath));
    String actualResult=item.getText();
    if (actualResult.equals(expectedResult)) {
        System.out.println(
                        "Expected Title: " + expectedResult + "\n" +
                        "Actual Title: " + actualResult);
    } else {
        System.out.println(
                        "Expected Title: " + expectedResult + "\n" +
                        "Actual Title: " + actualResult);
    }


}
    public static void VerifyCounter(String expectedResult){
        List<WebElement> Title = Main.driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement i : Title){
            String actualResult = i.getText();

            if (actualResult.equals(expectedResult)) {
                System.out.print("Counter: ");
                System.out.println(Title.size());
                System.out.println(
                        "Counter Verification Passed:\n" +
                                "Expected Title: " + expectedResult + "\n" +
                                "Actual Title: " + actualResult);
            } else {
                System.out.println(
                        "Counter Verification Failed:\n" +
                                "Expected Title: " + expectedResult + "\n" +
                                "Actual Title: " + actualResult);
            }
        }
    }
    public static void VerifyAmount(String expectedResult) {
        List<WebElement> Title = Main.driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement i : Title) {
            String actualResult = i.getText();

            if (actualResult.equals(expectedResult)) {
                System.out.println(
                        "Amount Verification Passed:\n" +
                                "Expected Amount: " + expectedResult + "\n" +
                                "Actual Amount: " + actualResult);
            } else {
                System.out.println(
                        "Amount Verification Failed:\n" +
                                "Expected Amount: " + expectedResult + "\n" +
                                "Actual Amount: " + actualResult);
            }
        }
    }
}
