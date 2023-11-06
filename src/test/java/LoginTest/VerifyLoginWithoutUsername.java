package LoginTest;

import junit.framework.Assert;
import org.example.Locators;
import org.example.url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginWithoutUsername {

    public static void main(String[] args) {

        //final String urlLoginPage = "https://www.saucedemo.com/";
        final String urlProductPage = "https://www.saucedemo.com/inventory.html";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(url.urlLoginPage);

        //set username
        WebElement inputUserName = driver.findElement(By.id("user-name"));
        inputUserName.clear();

        //set password
        WebElement inputPassword = driver.findElement(By.id(Locators.inputPassword));
        inputPassword.clear();
        inputPassword.sendKeys("secret_sauce");

        //click on login
        WebElement btnLoggin = driver.findElement(By.id("login-button"));
        btnLoggin.click();

        //validacija, potvrda da je test pao/prosao
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if (currentUrl.equals(url.urlLoginPage)) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }




            Assert.assertEquals("Current url i  not as expected", urlProductPage, currentUrl);

            driver.quit();

    }
}