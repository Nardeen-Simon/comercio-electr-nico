package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_RegistrationPageElements {

    public WebElement clickRegisterPOM(WebDriver driver){
        By clickRegister = By.cssSelector("a[class=\"ico-register\"]");
        WebElement clickRegisterEle = driver.findElement(clickRegister);
        return clickRegisterEle;
    }
    public WebElement RegistfirstNamePOM(WebDriver driver){
        By firstName = By.id("FirstName");
        WebElement firstNameEle = driver.findElement(firstName);
        return firstNameEle;
    }

    public WebElement RegistlastNamePOM(WebDriver driver){
        By lastName = By.id("LastName");
        WebElement lastNameEle = driver.findElement(lastName);
        return lastNameEle;
    }
    public WebElement RegistEmailPOM(WebDriver driver){
        By Email = By.id("Email");
        WebElement EmailEle = driver.findElement(Email);
        return EmailEle;
    }
    public WebElement RegistPasswordPOM(WebDriver driver){
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }
    public WebElement RegistConfirmPasswordPOM(WebDriver driver){
        By ConfirmPassword = By.id("ConfirmPassword");
        WebElement ConfirmPasswordEle = driver.findElement(ConfirmPassword);
        return ConfirmPasswordEle;
    }
    public WebElement clickRegisterBtnPOM(WebDriver driver){
        By clickRegister = By.id("register-button");
        WebElement clickRegisterEle = driver.findElement(clickRegister);
        return clickRegisterEle;
    }
    public WebElement clickContinueBtnPOM(WebDriver driver){
        By Continue = By.cssSelector("a[class=\"button-1 register-continue-button\"]");
        WebElement clickContinueEle = driver.findElement(Continue);
        return clickContinueEle;
    }
    public By navigatedWelcomePage() {return By.cssSelector("a[class=\"button-1 register-continue-button\"]");}

}
