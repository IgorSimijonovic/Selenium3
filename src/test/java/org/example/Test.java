package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        final String urlLoginPage = "https://www.saucedemo.com/";
        final String urlProductsPage = "https://www.saucedemo.com/inventory.html";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(urlLoginPage);

        //set username
        WebElement inputUserName = driver.findElement(By.id("user-name"));
        inputUserName.clear();
        inputUserName.sendKeys("standard_user");

        //set password
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.clear();
        inputPassword.sendKeys("secret_sauce");

        //driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //click on login
        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();

        //validacija da li je test pao/prosao
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if(currentUrl.equals(urlProductsPage)) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        driver.quit();
    }
    }
