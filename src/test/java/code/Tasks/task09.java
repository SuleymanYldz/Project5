package code.Tasks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class task09 {

//    website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//    Test Scenario:
//            * 		Go to the above URL.
//* 		Get the current window’s handle and write to the console window. It must be the first window handle.
//* 		Locate the “Visit W3Schools.com!” link and click it.
//            * 		Get all window handles and hold them in a list.
//            * 		Write to total window handle number to the console. It must be 2.
//            * 		Switch t the second window.
//* 		Get the current window’s handle and write to the console window. It must be a second window handle.
//* 		Check the upper left side logo in the second window.
//            * 		Go back (Switch) to the first window.
//            * 		Get the current window’s handle and write to the console window. It must be the first window handle.
//* 		Check the See Run Button Text. It must contain “Run >” text.

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver=WebDriverutil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

    }
    @Test
    public void TC1(){


    }
}
