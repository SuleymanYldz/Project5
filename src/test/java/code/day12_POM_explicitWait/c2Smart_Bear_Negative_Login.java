package code.day12_POM_explicitWait;

import code.DropDownJavaFaker.Smart_Bear_login;
import code.Pages.BasePage;
import code.Pages.SmartBearLoginPage;
import code.base.TestBase2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driverutil;
import utilities.PropertiesReadingUtil;

public class c2Smart_Bear_Negative_Login extends TestBase2 {


    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_Negative_Test_SmartBearLogin(){
        Driverutil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
        PropertiesReadingUtil.getProperties("SmartBear_invalidPassword"));


        String expectedMessage="Invalid Login or Password.";
        String actualMessage =smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualMessage,"Negative login verification has failed, user was able to login");

    }
}
