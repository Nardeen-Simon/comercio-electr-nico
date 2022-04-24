package stepDefinations;
import org.junit.Assert;
import Pages.P9_AddToPageElements;
import io.cucumber.java.en.*;

public class SD10_AddToWishListStepDefinitions {
    P9_AddToPageElements add;
    @When("User Choose The Digital Downloads Category")
    public void user_choose_the_digital_downloads_category() throws InterruptedException {
        //create objects
        add= new P9_AddToPageElements();
        Thread.sleep(3000);

        //choose Digital downloads category
        add.chooseCategory(Hook.driver).click();
        Thread.sleep(3000);
    }
    @And("Click on Digital item add to Wishlist button")
    public void click_on_digital_item_add_to_wishlist_button() throws InterruptedException {
        add.AddCItemToWishlist(Hook.driver).click();
        Thread.sleep(3000);
    }
    @Then("Digital item added to the Wishlist")
    public void digital_item_added_to_the_wishlist() throws InterruptedException {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(add.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        Thread.sleep(3000);
    }
}
