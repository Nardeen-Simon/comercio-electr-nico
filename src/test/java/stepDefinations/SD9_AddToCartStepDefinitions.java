package stepDefinations;
import Utilities.BrowserUtils;
import io.cucumber.java.en.*;
import Pages.P9_AddToPageElements;
import org.junit.Assert;

public class SD9_AddToCartStepDefinitions {
    P9_AddToPageElements addToCart;

    @When("When user choose the books category")
    public void user_choose_books_the_category() {
        //create objects
        addToCart= new P9_AddToPageElements();
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);
        //choose books category
        addToCart.chooseCategory2(Hook.driver).click();
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);
    }
    @And("click on book item add to cart button")
    public void click_on_book_add_to_cart_button() {
        addToCart.AddCItemToCart(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("book added to the shopping cart")
    public void product_book_added_to_the_shopping_cart() {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(addToCart.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

    @When("click on another book item add to cart button")
    public void click_on_another_book_add_to_cart_button() {
        addToCart.AddCItemToCart2(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
    @Then("another book added to the shopping cart")
    public void another_book_added_to_the_shopping_cart() {
        String expectedResult = "The product has been added to your ";
        String actualResult = Hook.driver.findElement(addToCart.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }
}
