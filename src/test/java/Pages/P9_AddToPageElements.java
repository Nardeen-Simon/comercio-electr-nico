package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P9_AddToPageElements {
    public WebElement chooseCategory(WebDriver driver){
        By category = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a");
        WebElement categoryEle = driver.findElement(category);
        return categoryEle;
    }
    public WebElement chooseCategory2(WebDriver driver){
        By category = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
        WebElement categoryEle = driver.findElement(category);
        return categoryEle;
    }

    // Add to cart
    public WebElement AddCItemToCart(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public WebElement AddCItemToCart2(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public By AssertResult(){return By.className("content");}


    // Add to Wishlist
    public WebElement AddCItemToWishlist(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
//    public WebElement AddCItem2ToWishlist(WebDriver driver){
//        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[3]");
//        WebElement ItemEle = driver.findElement(Item);
//        return ItemEle;
//    }

    // Add to comparelist
    public WebElement AddCItemToComparelist(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[2]");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
    public WebElement AddCItem2ToComparelist(WebDriver driver){
        By Item = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[2]");
        WebElement ItemEle = driver.findElement(Item);
        return ItemEle;
    }
}
