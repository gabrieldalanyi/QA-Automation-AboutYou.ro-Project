package features;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.ProductSteps;
import steps.SearchSteps;

@RunWith(SerenityRunner.class)
public class Basetest {
@Managed(uniqueSession = true)
public WebDriver driver;


    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected ProductSteps productSteps;

    @Steps LoginSteps loginSteps;




    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get("https://www.aboutyou.ro/");
    }
}
