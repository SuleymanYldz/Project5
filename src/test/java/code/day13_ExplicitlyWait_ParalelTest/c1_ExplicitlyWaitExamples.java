package code.day13_ExplicitlyWait_ParalelTest;

import code.base.TestBase2;
import org.testng.annotations.Test;
import utilities.Driverutil;

public class c1_ExplicitlyWaitExamples extends TestBase2 {


//go tto http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify "WebDriver" text present

    @Test
    public void TC1_ExplicitlyWaitWithPOM(){

        Driverutil.getDriver().get(" http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


    }

}
