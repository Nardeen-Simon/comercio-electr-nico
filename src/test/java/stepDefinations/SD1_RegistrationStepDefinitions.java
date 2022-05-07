package stepDefinations;
import Pages.P1_RegistrationPageElements;
import Pages.P2_LoginPageElements;
import Utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class SD1_RegistrationStepDefinitions {
    P1_RegistrationPageElements Register;
    P2_LoginPageElements login;

    @And("user is in site page then click register button")
    public void user_is_in_site_page(){
        //4- create new objects
        Register = new P1_RegistrationPageElements();
        login= new P2_LoginPageElements();

        Register.clickRegisterPOM(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

    @When("user enters First name and Last name and Email and Password")
    public void enter_user_data(){
        Register.RegistfirstNamePOM(Hook.driver).sendKeys("nardeen");
        BrowserUtils.waitFor(2);
        //Thread.sleep(2000);
        Register.RegistlastNamePOM(Hook.driver).sendKeys("simon");
        BrowserUtils.waitFor(2);
        //Thread.sleep(2000);
        Register.RegistEmailPOM(Hook.driver).sendKeys("nardeensimon@yahoo.com");
        BrowserUtils.waitFor(2);
        //Thread.sleep(2000);
        Register.RegistPasswordPOM(Hook.driver).sendKeys("123456");
        BrowserUtils.waitFor(2);
        //Thread.sleep(2000);
        Register.RegistConfirmPasswordPOM(Hook.driver).sendKeys("123456");
        BrowserUtils.waitFor(2);
        //Thread.sleep(3000);
    }

    @And("click on register button")
    public void click_on_register_button()throws InterruptedException{
        Register.clickRegisterBtnPOM(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

    @Then("user is navigated to the registration welcome page")
    public void navigated_to_the_welcome_page() throws InterruptedException {
        Assert.assertTrue(Hook.driver.findElement(Register.navigatedWelcomePage()).isDisplayed());
        Register.clickContinueBtnPOM(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(5000);
    }
}
