package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage2 {

    public ChromeDriver driver;

    public LoginPage2(ChromeDriver driver){
        this.driver = driver;
    }

    public void openPage(){
        driver.get("https://www.saucedemo.com/");
    }
    //metode za lociranje web elemenata
    public WebElement returnUserName(){
        return  driver.findElement(By.id("user-name"));
    }

    public WebElement returnPassword(){
        return  driver.findElement(By.id("password"));
    }

    public WebElement returnLogin(){
        return  driver.findElement(By.id("login-button"));
    }


    //metode za akcije nad web elementima
    public void setUserName(String username) {
        //returnUserName().clear();
        returnUserName().sendKeys(username);
    }
    public void setPassword(String password) {
        returnUserName().sendKeys(password);
    }
    public void clickOnLogin(){
        returnLogin().click();
    }
}



