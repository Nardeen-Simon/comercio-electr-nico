package stepDefinations;
import Pages.P9_AddToPageElements;
import Pages.P10_SuccessOrderPageElements;
import org.junit.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

public class SD12_SuccessfulOrderStepDefinitions {
    P9_AddToPageElements addToCart;
    P10_SuccessOrderPageElements SuccessOrder;

    @When("check the shopping cart")
    public void check_the_shopping_cart() throws InterruptedException {
        //create objects
        addToCart= new P9_AddToPageElements();
        SuccessOrder =new P10_SuccessOrderPageElements();

        Thread.sleep(3000);
        Actions act1 = new Actions(Hook.driver);
        act1.moveToElement(SuccessOrder.selectCatPOM(Hook.driver)).moveToElement(SuccessOrder.SelectItemPOM(Hook.driver)).click().build().perform();
        Thread.sleep(3000);
    }

    @When("select gift wrapping needed")
    public void select_gift_wrapping_needed() throws InterruptedException {
        SuccessOrder.SelectWarpPOM(Hook.driver).click();
        SuccessOrder.SelectWarpNeededPOM(Hook.driver).click();
        Thread.sleep(3000);
    }
    @When("click on terms agreement")
    public void click_on_terms_agreement() throws InterruptedException {
        SuccessOrder.termsAgreementPOM(Hook.driver).click();
        Thread.sleep(2000);
    }
    @When("Click on checkout button")
    public void click_on_checkout_button() throws InterruptedException {
        SuccessOrder.checkout(Hook.driver).click();
        Thread.sleep(6000);
    }
    @Then("Entering Bill information and press continue")
    public void entering_bill_information_and_press_continue() throws InterruptedException {
        // Billing Address
        // Country
        SuccessOrder.CountryIDPOM(Hook.driver).click();
        SuccessOrder.SelectCountryPOM(Hook.driver).click();
        Thread.sleep(4000);

        // city
        SuccessOrder.CityPOM(Hook.driver).sendKeys("Cairo");
        Thread.sleep(4000);

        // Address1
        SuccessOrder.AddressPOM(Hook.driver).sendKeys("AAAAAA district");
        Thread.sleep(4000);

        //ZipPostalCode
        SuccessOrder.ZipCodePOM(Hook.driver).sendKeys("5678");
        Thread.sleep(4000);

        //PhoneNumber
        SuccessOrder.phonePOM(Hook.driver).sendKeys("010000000000");
        Thread.sleep(4000);
        //continue button
        SuccessOrder.presscontinuePOM(Hook.driver).click();
        Thread.sleep(4000);
    }

    @And("Shipping method and press continue")
    public void Shipping_method_and_press_continue() throws InterruptedException {
        // shipping method
        SuccessOrder.ShippingMethodPOM(Hook.driver).click();
        Thread.sleep(4000);

        // press continue
        SuccessOrder.presscontinue2POM(Hook.driver).click();
        Thread.sleep(2000);
    }
    @And("Payment method and press continue")
    public void Payment_method_and_press_continue() throws InterruptedException {
        // payment info
        SuccessOrder.PaymentMethodPOM(Hook.driver).click();
        SuccessOrder.presscontinue3POM(Hook.driver).click();
        Thread.sleep(2000);
    }
    @And("Payment information and press continue")
    public void Payment_information_and_press_continue() throws InterruptedException {
        SuccessOrder.VisaPaymentInfoPOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.visaTypePOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.holderNamePOM(Hook.driver).sendKeys("nardeen");
        Thread.sleep(2000);
        SuccessOrder.CardNumberPOM(Hook.driver).sendKeys("000000000000");
        Thread.sleep(2000);
        SuccessOrder.ExpireMonthPOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.MonthPOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.ExpireYearPOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.YearPOM(Hook.driver).click();
        Thread.sleep(2000);
        SuccessOrder.CardCodePOM(Hook.driver).sendKeys("3232");
        Thread.sleep(2000);
        SuccessOrder.presscontinue4POM(Hook.driver).click();
    }
    @And("Confirm order")
    public void confirm_order() throws InterruptedException {
        // confirm order
        SuccessOrder.confirmPOM(Hook.driver).click();
        Thread.sleep(2000);

        String expectedResult = "Your order has been successfully processed!";
        String actualResult = Hook.driver.findElement(SuccessOrder.AssertResult()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        Thread.sleep(3000);
    }
    @Then("show invoice details and print the Details")
    public void show_invoice_details() throws InterruptedException {
        SuccessOrder.invoiceDetailsPOM(Hook.driver).click();
        Thread.sleep(3000);
        SuccessOrder.printDetailsPOM(Hook.driver).click();
        Thread.sleep(3000);
    }

}
