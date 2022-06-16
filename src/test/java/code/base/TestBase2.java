package code.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.Driverutil;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {


    @BeforeMethod
    public void setUp(){
        Driverutil.getDriver().manage().window().maximize();
        Driverutil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closing(){
        BrowserUtils.wait(5);
       // Driverutil.closeDriver();
    }
}
