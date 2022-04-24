package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_ResetPasswordPageElements {

    public WebElement clickLogInPOM(WebDriver driver){
        By clickLogIn = By.cssSelector("a[class=\"ico-login\"]");
        WebElement clickLogInEle = driver.findElement(clickLogIn);
        return clickLogInEle;
    }
    public WebElement resetPassPOM(WebDriver driver){
        By ResetPass = By.linkText("Forgot password?");
        WebElement resetPassEle = driver.findElement(ResetPass);
        return resetPassEle;
    }
    public WebElement userEmailPOM(WebDriver driver){
        By userEmail = By.id("Email");
        WebElement userEmailEle = driver.findElement(userEmail);
        return userEmailEle;
    }
    public By displayMessagePOM(){ return By.xpath("//*[@id=\"bar-notification\"]/div/p");}

}
