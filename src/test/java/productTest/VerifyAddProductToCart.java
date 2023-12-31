package productTest;

import junit.framework.Assert;
import org.example.url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifyAddProductToCart {

    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(url.urlLoginPage);

        //set username
        WebElement inputUserName = driver.findElement(By.id("user-name"));
        inputUserName.clear();
        inputUserName.sendKeys("standard_user");
        System.out.println(inputUserName.getAttribute("value"));

        //set password
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.clear();
        inputPassword.sendKeys("secret_sauce");

        //click on login
        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();

        //nalazimo invetory_list
        WebElement inventoryList = driver.findElement(By.xpath("//div[@class='inventory_list']"));
        List<WebElement> inventoryItems = inventoryList.findElements(By.xpath("//div[@class='inventory_item']"));

        for(int i = 0; i < inventoryItems.size(); i++) {
            WebElement item = inventoryItems.get(i);
            WebElement itemName = item.findElement(By.xpath(".//div[@class='inventory_item_name ']"));
            if (itemName.getText().equals("Sauce Labs Backpack")); {
                //WebElement button = item.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
                WebElement button = item.findElement(By.xpath(".//button"));
                button.click();
                System.out.println("Item added");
                break;
            }
        }
        System.out.println("");

        //lociramo cart
       // WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
      //WebElement cartSpan = cart.findElement(By.xpath(".//span"));

        WebElement cartSpan = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        System.out.println(cartSpan.getText());

        Assert.assertEquals("Cart number is not as expected","1",cartSpan.getText());

        driver.quit();


    }
}