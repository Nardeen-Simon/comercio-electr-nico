package stepDefinations;
import Pages.P2_LoginPageElements;
import Utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class SD8_LoginStepDefinitions {
    P2_LoginPageElements login;

    @Given("user click on login button")
    public void user_is_in_login_page() {
        //4- create new objects
        login =new P2_LoginPageElements();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        login.clickLogInPOM(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Enter user email using POM
        login.userEmailPOM(Hook.driver).clear();
        login.userEmailPOM(Hook.driver).sendKeys("nardeensimon@yahoo.com");
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
        // Enter password using POM
        login.passwordPOM(Hook.driver).clear();
        login.passwordPOM(Hook.driver).sendKeys("123456");
        login.passwordPOM(Hook.driver).sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
        Assert.assertTrue(Hook.driver.findElement(login.logoutPOM()).isDisplayed());
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        login.navHomePOM(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(2000);
    }
}
