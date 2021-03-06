package stepDefinations;
import Pages.P6_SelectCategoryPageElements;
import Utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SD4_SelectCategoryStepDefinition {
    P6_SelectCategoryPageElements SelectCat;

    @When("user select random category and hover it")
    public void user_select_random_category() {
        //create objects
        SelectCat=new P6_SelectCategoryPageElements();

        //computers --> notebooks cat.
        Actions act1 = new Actions(Hook.driver);
        act1.moveToElement(SelectCat.selectCatPOM(Hook.driver));
        act1.moveToElement(SelectCat.SelectItemPOM(Hook.driver)).click().build().perform();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("open sub-Category if found")
    public void open_sub_Category_if_found() {
            String expectedResult ="Notebooks";
            String actualResult = SelectCat.AssertResult(Hook.driver).getText();
            Assert.assertTrue(actualResult.contains(expectedResult));
            BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
}
