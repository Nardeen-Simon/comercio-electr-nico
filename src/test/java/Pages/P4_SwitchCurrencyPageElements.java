package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_SwitchCurrencyPageElements {

    public WebElement dropDown(WebDriver driver){
        By dropDown= By.id("customerCurrency");
        WebElement dropDownEle = driver.findElement(dropDown);
        return dropDownEle;
    }
    public WebElement selectCurrency(WebDriver driver){
        By Euro= By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]");
        WebElement EuroEle = driver.findElement(Euro);
        return EuroEle;
    }
    public  By AssertSelectCurrency(){ return By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]"); }

}
