package code.day12_POM_explicitWait;

import code.Pages.SmartBearLoginPage;
import code.base.TestBase2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driverutil;
import utilities.PropertiesReadingUtil;

public class c1_SmartBearPomExample extends TestBase2 {

    @Test
    public void TC1_SmartBearPositiveVerification(){
        Driverutil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));



    }
}
