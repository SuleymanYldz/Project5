package code.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtils;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class c1_WebTable {

    WebDriver driver;
    @BeforeMethod

    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3.Login
        SmartBearUtils.loginSmartBear(driver);

    }

    @Test
    public void TC1_VerifyMarkStreetName(){

        WebElement markStreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
        System.out.println("Mark street name "+ markStreet.getText());

       String actualStreet=markStreet.getText();
       String expected="9, Maple Valley";

        Assert.assertEquals(actualStreet,expected,"Street name verification has failed");

    }
}
