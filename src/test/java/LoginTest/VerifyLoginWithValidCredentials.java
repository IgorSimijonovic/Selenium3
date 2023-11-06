package LoginTest;

import junit.framework.Assert;
import org.example.url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginWithValidCredentials {

    public static void main(String[] args) {

        //final String urlLoginPage = "https://www.saucedemo.com/";
        final String urlProductPage = "https://www.saucedemo.com/inventory.html";

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

        //validacija, potvrda da je test pao/prosao
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

       /// if (currentUrl.equals(urProductPage)) {
            //System.out.println("Passed");
       // }
       // else {
           // System.out.println("Failed");
       // }




        Assert.assertEquals("Current url is not as expected",urlProductPage, currentUrl);

        driver.quit();

    }
}

