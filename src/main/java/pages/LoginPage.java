package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

public ChromeDriver driver;
public LoginPage(ChromeDriver driver){
    this.driver = driver;

}

public void openPage(){
    driver.get("https://www.saucedemo.com/");
}


    //metoda za lociranje web elemenata

     public  void setUserName(String username){
         driver.findElement(By.id("user-name")).sendKeys(username);


     }

    public void setPassword(String secretSauce) {
    }

    public void clickOnLogin() {
    }

}


