package stepDefinations;
import Pages.P7_FilterWithColorElements;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

public class SD5_FilterStepDefinitions {
    P7_FilterWithColorElements filter;

    @When("user select specific category")
    public void user_select_specific_category() throws InterruptedException {
        filter =new P7_FilterWithColorElements();
        Thread.sleep(2000);
        // Shoes category
        Actions act1 = new Actions(Hook.driver);
        act1.moveToElement(filter.selectCatPOM(Hook.driver)).moveToElement(filter.SelectItemPOM(Hook.driver)).click().build().perform();
        Thread.sleep(3000);
    }

    @Then("user could filter category with color")
    public void user_could_filter_category_with_color() throws InterruptedException {
        // filter by color
        filter.filterWithColorPOM(Hook.driver).click();
        Thread.sleep(6000);
    }
}
