package stepDefinations;
import Pages.P4_SearchPageElements;
import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class SD3_SearchStepDefinitions {
    P4_SearchPageElements search;

    @And("user click on search field")
    public void click_on_search_field() {
        search =new P4_SearchPageElements();
        search.SearchField(Hook.driver).click();
        BrowserUtils.waitFor(6);
        //Thread.sleep(6000);
    }

    @When("user search with product full name")
    public void search_with_product_fullname() throws InterruptedException {
        search.SearchField(Hook.driver).sendKeys("Necklace");
        Thread.sleep(6000);
    }

    @And("press search button")
    public void press_search() {
        search.pressSearch(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(6000);

    }

    @Then("user could find relative results")
    public void user_find_relative_results() {
        int count= Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
        System.out.println(count);
        Assert.assertTrue(count>0 );
        ArrayList <String> prodList= null;
        prodList =new ArrayList <String> ();

        for (int x=0; x< count; x++) {
            System.out.println(Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            prodList.add(Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("necklace"));
        }
        System.out.println(prodList);
        BrowserUtils.waitFor(6);
        //Thread.sleep(6000);
    }
    @And("choose the searched item")
    public void choose_the_searched_item() {
        search.SearchesItem(Hook.driver).click();
        BrowserUtils.waitFor(3);
        //Thread.sleep(3000);
    }

}
