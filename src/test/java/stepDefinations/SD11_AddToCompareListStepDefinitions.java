package stepDefinations;
import Pages.P9_AddToPageElements;
import Utilities.BrowserUtils;
import org.junit.Assert;
import io.cucumber.java.en.*;

public class SD11_AddToCompareListStepDefinitions {
    P9_AddToPageElements add;
    @When("Click on Digital item add to CompareList button")
    public void Click_on_Digital_item_add_to_CompareList_button() {
        //create objects
        add= new P9_AddToPageElements();
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);

        add.AddCItemToComparelist(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("Digital item added to the CompareList")
    public void Digital_item_added_to_the_CompareList() {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(add.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

    @When("click on another Digital item add to CompareList button")
    public void click_on_another_Digital_item_add_cart_button() {
        add.AddCItem2ToComparelist(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("another Digital item added to the CompareList")
    public void another_Digital_item_added_to_the_CompareList() {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(add.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

}
