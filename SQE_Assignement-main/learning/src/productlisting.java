import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import  java.util.Random;
public class productlisting {

    //    public static String productID = "item_!_"
    public static String productSelection(String xpath) {

        List<WebElement> items = Main.driver.findElements(By.xpath(xpath));
        Random Random = new Random();
        int index = Random.nextInt(items.size());
        WebElement item = items.get(index);
        System.out.println(item.getText());
        return  item.getText();

    }
//
//        String actualTitle = Main.driver.getTitle();
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

    public static void listingProduct() {
        List<WebElement> Desc = Main.driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement i : Desc) {
            String actualResult = i.getText();
            System.out.println(actualResult);
        }

    }
}


