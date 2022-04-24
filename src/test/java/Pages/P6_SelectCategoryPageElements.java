package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_SelectCategoryPageElements {
    public WebElement selectCatPOM(WebDriver driver){
        By category = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
        WebElement webEle = driver.findElement(category);
        return webEle;
    }
    public WebElement SelectItemPOM(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public WebElement AssertResult(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
}
