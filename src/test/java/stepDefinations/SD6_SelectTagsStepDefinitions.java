package stepDefinations;
import Pages.P2_LoginPageElements;
import Pages.P8_SelectTagsPageElements;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SD6_SelectTagsStepDefinitions {
    P2_LoginPageElements login;
    P8_SelectTagsPageElements selectTags;

    @When("user select camera tag")
    public void user_camera_tage() throws InterruptedException {

        selectTags = new P8_SelectTagsPageElements();
        login =new P2_LoginPageElements();

            // camera
            selectTags.CameraItemPOM(Hook.driver).click();
            Thread.sleep(3000);
    }
    @Then("user could find relative results of camera tag")
    public void user_could_find_relative_results_of_camera_tag() throws InterruptedException {
        String actualResult = Hook.driver.findElement(selectTags.AssertResult()).getText();
        Assert.assertEquals(actualResult.contains("camera"),true);
        Thread.sleep(3000);
    }

    @When("user select awesome tag")
    public void user_select_tage() throws InterruptedException {
//        //view all
        Thread.sleep(3000);
        //awesome tag
        selectTags.awesomeItemPOM(Hook.driver).click();
        Thread.sleep(3000);
    }
    @Then("user could find relative results of awesome tag")
    public void user_could_find_relative_results_of_awesome_tag() throws InterruptedException {
        String actualResult = Hook.driver.findElement(selectTags.AssertResult()).getText();
        Assert.assertEquals(actualResult.contains("awesome"),true);
        Thread.sleep(3000);
    }
    @And("log out")
    public void logged_out() throws InterruptedException {
        login.logoutAction(Hook.driver).click();
        Thread.sleep(3000);
    }
}
