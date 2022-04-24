package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P8_SelectTagsPageElements {
    public WebElement CameraItemPOM(WebDriver driver){
        By camera = By.xpath("//a[@href=\"/camera\"]");
        WebElement cameraEle = driver.findElement(camera);
        return cameraEle;
    }
    public By AssertResult(){return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");}

    public WebElement awesomeItemPOM(WebDriver driver){
        By awesome = By.xpath("//a[@href=\"/awesome\"]");
        WebElement awesomeEle = driver.findElement(awesome);
        return awesomeEle;
    }

}
