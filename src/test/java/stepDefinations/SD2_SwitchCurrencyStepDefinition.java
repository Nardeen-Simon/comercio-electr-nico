package stepDefinations;
import Pages.P4_SwitchCurrencyPageElements;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SD2_SwitchCurrencyStepDefinition {
    P4_SwitchCurrencyPageElements switchCurrency;
    @When("user could switch between currencies US-Euro")
    public void hover_the_euro_button_and_click() throws InterruptedException {
        switchCurrency =new P4_SwitchCurrencyPageElements();
        switchCurrency.dropDown(Hook.driver).click();
        Thread.sleep(500);
        switchCurrency.selectCurrency(Hook.driver).click();
        Thread.sleep(3000);

    }
    @Then("Assert currencies is switched")
    public void Assert_currencies_is_switched() throws InterruptedException {
        Assert.assertTrue(Hook.driver.findElement(switchCurrency.AssertSelectCurrency()).isDisplayed());
        Thread.sleep(3000);
    }

}
