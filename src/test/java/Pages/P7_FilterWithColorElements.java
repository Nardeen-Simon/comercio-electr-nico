package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P7_FilterWithColorElements {
    public WebElement selectCatPOM(WebDriver driver){
        By category = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a");
        WebElement webEle = driver.findElement(category);
        return webEle;
    }
    public WebElement SelectItemPOM(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public WebElement filterWithColorPOM (WebDriver driver){
        By filter = By.id("attribute-option-15");
        WebElement filterEle = driver.findElement(filter);
        return filterEle;
    }
}
