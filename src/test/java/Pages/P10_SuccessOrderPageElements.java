package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P10_SuccessOrderPageElements {
    public WebElement selectCatPOM(WebDriver driver){
        By category = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a");
        WebElement webEle = driver.findElement(category);
        return webEle;
    }
    public WebElement SelectItemPOM(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[2]/div/div[4]/button");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public WebElement SelectWarpPOM(WebDriver driver){
        By warp = By.id("checkout_attribute_1");
        WebElement warpEle = driver.findElement(warp);
        return warpEle;
    }
    public WebElement SelectWarpNeededPOM(WebDriver driver){
        By WarpNeeded = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[2]/dl/dd/select/option[2]");
        WebElement WarpNeededEle = driver.findElement(WarpNeeded);
        return WarpNeededEle;
    }
    public WebElement termsAgreementPOM(WebDriver driver){
        By agree = By.id("termsofservice");
        WebElement agreeEle = driver.findElement(agree);
        return agreeEle;
    }
    public WebElement checkout(WebDriver driver){
        By checkout = By.id("checkout");
        WebElement checkoutEle = driver.findElement(checkout);
        return checkoutEle;
    }
    public WebElement CountryIDPOM(WebDriver driver){
        By Country = By.id("BillingNewAddress_CountryId");
        WebElement CountryEle = driver.findElement(Country);
        return CountryEle;
    }
    public WebElement SelectCountryPOM(WebDriver driver){
        By Country = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select/option[66]");
        WebElement SelectCountry = driver.findElement(Country);
        return SelectCountry;
    }
    public WebElement CityPOM(WebDriver driver){
        By City = By.id("BillingNewAddress_City");
        WebElement CityEle = driver.findElement(City);
        return CityEle;
    }
    public WebElement AddressPOM(WebDriver driver){
        By Address = By.id("BillingNewAddress_Address1");
        WebElement AddressEle = driver.findElement(Address);
        return AddressEle;
    }
    public WebElement ZipCodePOM(WebDriver driver){
        By ZipCode = By.id("BillingNewAddress_ZipPostalCode");
        WebElement ZipCodeEle = driver.findElement(ZipCode);
        return ZipCodeEle;
    }
    public WebElement phonePOM(WebDriver driver){
        By phone = By.id("BillingNewAddress_PhoneNumber");
        WebElement phoneEle = driver.findElement(phone);
        return phoneEle;
    }
    public WebElement presscontinuePOM(WebDriver driver){
        By continuebtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]");
        WebElement continueEle = driver.findElement(continuebtn);
        return continueEle;
    }
    public WebElement ShippingMethodPOM(WebDriver driver){
        By ShippingMethod = By.id("shippingoption_1");
        WebElement ShippingMethodEle = driver.findElement(ShippingMethod);
        return ShippingMethodEle;
    }
    public WebElement presscontinue2POM(WebDriver driver){
        By continuebtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button");
        WebElement continueEle = driver.findElement(continuebtn);
        return continueEle;
    }
    public WebElement PaymentMethodPOM(WebDriver driver){
        By PaymentMethod = By.id("paymentmethod_1");
        WebElement PaymentMethodEle = driver.findElement(PaymentMethod);
        return PaymentMethodEle;
    }

    public WebElement presscontinue3POM(WebDriver driver){
        By continuebtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button");
        WebElement continueEle = driver.findElement(continuebtn);
        return continueEle;
    }

    public WebElement VisaPaymentInfoPOM(WebDriver driver){
        By PaymentInfo = By.id("CreditCardType");
        WebElement PaymentInfoEle = driver.findElement(PaymentInfo);
        return PaymentInfoEle;
    }
    public WebElement visaTypePOM(WebDriver driver){
        By visaType = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[1]/td[2]/select/option[3]");
        WebElement visaTypeEle = driver.findElement(visaType);
        return visaTypeEle;
    }
    public WebElement holderNamePOM(WebDriver driver){
        By holderName = By.id("CardholderName");
        WebElement holderNameEle = driver.findElement(holderName);
        return holderNameEle;
    }
// CardNumber
    public WebElement CardNumberPOM(WebDriver driver){
        By CardNumber = By.id("CardNumber");
        WebElement CardNumberEle = driver.findElement(CardNumber);
        return CardNumberEle;
    }
    // ExpireMonth
    public WebElement ExpireMonthPOM(WebDriver driver){
        By ExpireMonth = By.id("ExpireMonth");
        WebElement ExpireMonthEle = driver.findElement(ExpireMonth);
        return ExpireMonthEle;
    }
    public WebElement MonthPOM(WebDriver driver){
        By Month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[4]/td[2]/select[1]/option[2]");
        WebElement MonthEle = driver.findElement(Month);
        return MonthEle;
    }
    //ExpireYear
    public WebElement ExpireYearPOM(WebDriver driver){
        By ExpireYear = By.id("ExpireYear");
        WebElement ExpireYearEle = driver.findElement(ExpireYear);
        return ExpireYearEle;
    }
    public WebElement YearPOM(WebDriver driver){
        By Year = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[4]/td[2]/select[2]/option[3]");
        WebElement YearEle = driver.findElement(Year);
        return YearEle;
    }
//CardCode
public WebElement CardCodePOM(WebDriver driver){
    By CardCode = By.id("CardCode");
    WebElement CardCodeEle = driver.findElement(CardCode);
    return CardCodeEle;
}
//
public WebElement presscontinue4POM(WebDriver driver){
    By continuebtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button");
    WebElement continueEle = driver.findElement(continuebtn);
    return continueEle;
}
    public WebElement confirmPOM(WebDriver driver){
        By confirm = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button");
        WebElement confirmEle = driver.findElement(confirm);
        return confirmEle;
    }
    public By AssertResult(){return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");}

    public WebElement invoiceDetailsPOM(WebDriver driver){
        By invoiceDetails = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a");
        WebElement invoiceDetailsEle = driver.findElement(invoiceDetails);
        return invoiceDetailsEle;
    }
    public WebElement printDetailsPOM(WebDriver driver){
        By printDetails = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/a[2]");
        WebElement printDetailsEle = driver.findElement(printDetails);
        return printDetailsEle;
    }
}
