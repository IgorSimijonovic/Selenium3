package LoginTest;

import org.example.Locators;
import org.example.Message;
import org.example.url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginWithoutCredentials {

    public static void main(String[] args){

        final String urlProductsPage = "https://www.saucedemo.com/inventory.html";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(url.urlLoginPage);

        //WebElement btnLogin = driver.findElement(By.id("login-button"));
        WebElement btnLogin = driver.findElement(By.xpath(Locators.loginButton));
        btnLogin.click();

        //lociranje web elementa xpath-a
        String errorMessage = driver.findElement(By.xpath("//h3[data-test='error']")).getText();


        //Assert.assertEquals("Message is not as expected", "Epic sadface: Username is required", errorMessage);
        WebElement cloeErrorMessage= driver.findElement(By.xpath("//button[@class='error-button']"));
        cloeErrorMessage.click();


        if (errorMessage.equals(Message.errorWithoutCredentials)) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        driver.quit();
    }
}



