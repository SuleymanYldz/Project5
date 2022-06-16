package code.DropDownJavaFaker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class Smart_Bear_login {

    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Enter username --->Tester
//4- Enter password --->test
//5- Click "Login" button
//6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Test is starting");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Test has completed");
    }
    @BeforeMethod
    public void setUp(){
         driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void TC1enterUserName(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

        // Verify title equals: Web Orders
        String expectedTitle="Web Orders";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title verification has passed");

    }
}
