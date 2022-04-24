package Runner;
import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "stepDefinations",
        tags = "@smoke",
        dryRun = false,
        monochrome = true,
        plugin={"pretty:target/Cucumber-Reports/cucumber-htmlReport.txt",
                "json:target/Cucumber-Reports/cucumber-jsonReport.json",
                "html:target/Cucumber-Reports/cucumber-petty.html"
        })
 public class TestRunner extends AbstractTestNGCucumberTests{
}
