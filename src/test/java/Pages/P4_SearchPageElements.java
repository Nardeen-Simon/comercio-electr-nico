package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_SearchPageElements {
    public WebElement SearchField(WebDriver driver){
        By search = By.id("small-searchterms");
        WebElement searchEle = driver.findElement(search);
        return searchEle;
    }
    public WebElement pressSearch(WebDriver driver){
        By search = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement searchEle = driver.findElement(search);
        return searchEle;
    }
    public WebElement SearchesItem(WebDriver driver){
        By SearchesItem = By.linkText("Elegant Gemstone Necklace (rental)");
        WebElement SearchesItemEle = driver.findElement(SearchesItem);
        return SearchesItemEle;
    }
}
