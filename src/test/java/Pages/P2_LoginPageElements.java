package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P2_LoginPageElements {
    public WebElement clickLogInPOM(WebDriver driver){
        By clickLogIn = By.cssSelector("a[class=\"ico-login\"]");
        WebElement clickLogInEle = driver.findElement(clickLogIn);
        return clickLogInEle;
    }

    public WebElement userEmailPOM(WebDriver driver){
        By userEmail = By.id("Email");
        WebElement userEmailEle = driver.findElement(userEmail);
        return userEmailEle;
    }

    public WebElement passwordPOM(WebDriver driver){
            By password= By.id("Password");
            WebElement passwordEle = driver.findElement(password);
            return passwordEle;
        }
    public WebElement navHomePOM(WebDriver driver){
        By nav= By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img");
        WebElement navEle = driver.findElement(nav);
        return navEle;
    }
    public WebElement logoutAction(WebDriver driver){
        By logout= By.cssSelector("a[class=\"ico-logout\"]");
        WebElement logoutEle = driver.findElement(logout);
        return logoutEle;
    }

    public  By logoutPOM(){ return By.cssSelector("a[class=\"ico-logout\"]"); }

}
