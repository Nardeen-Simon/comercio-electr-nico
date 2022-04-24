package stepDefinations;
import Pages.P3_ResetPasswordPageElements;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SD7_ResetPassStepDefinitions {
    P3_ResetPasswordPageElements ResetPass;

    @And("Navigate to Login Page")
    public void navigate_to_login_page() throws InterruptedException{
        //4- create new objects
        ResetPass =new P3_ResetPasswordPageElements();

        ResetPass.clickLogInPOM(Hook.driver).click();
        Thread.sleep(3000);
    }
    @And("Click on forget password? button")
    public void click_on_forget_password_button()throws InterruptedException{
        ResetPass.resetPassPOM(Hook.driver).click();
        Thread.sleep(3000);

    }
    @When("user enter Email")
    public void user_enter_his_her_email() throws InterruptedException{
        ResetPass.userEmailPOM(Hook.driver).sendKeys("nardeensimon@yahoo.com");
        ResetPass.userEmailPOM(Hook.driver).sendKeys(Keys.ENTER);
    }

    @Then("message is displayed {string} will displayed")
    public void message_is_displayed_will_displayed(String string) throws InterruptedException{
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = Hook.driver.findElement(ResetPass.displayMessagePOM()).getText();
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Hook.driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
        Thread.sleep(3000);
    }

}
