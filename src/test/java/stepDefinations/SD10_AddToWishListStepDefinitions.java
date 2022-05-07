package stepDefinations;
import Utilities.BrowserUtils;
import org.junit.Assert;
import Pages.P9_AddToPageElements;
import io.cucumber.java.en.*;

public class SD10_AddToWishListStepDefinitions {
    P9_AddToPageElements add;
    @When("User Choose The Digital Downloads Category")
    public void user_choose_the_digital_downloads_category() {
        //create objects
        add= new P9_AddToPageElements();
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);

        //choose Digital downloads category
        add.chooseCategory(Hook.driver).click();
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);
    }
    @And("Click on Digital item add to Wishlist button")
    public void click_on_digital_item_add_to_wishlist_button() {
        add.AddCItemToWishlist(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("Digital item added to the Wishlist")
    public void digital_item_added_to_the_wishlist() {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(add.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
}
