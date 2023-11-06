package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void verifyLoginWithValidCredentials() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage= new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickOnLogin();

        //TODO assertion
    }
    @Test

    public void verifyLoginWithoutUserName() {
}

}

