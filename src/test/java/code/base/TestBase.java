package code.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class TestBase {
 // use access modifier here
    // test base for code reuseability
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
        //driver.close();
    }
}
