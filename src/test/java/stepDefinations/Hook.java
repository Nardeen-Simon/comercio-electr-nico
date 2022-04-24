package stepDefinations;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    public static WebDriver driver;

    @BeforeAll
    public static void openBrowser() throws InterruptedException {
        //1-bridge between test script and browsers
        String chromePath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver",chromePath);

        //2-New object of webDriver
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(6000);
    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
