package code.day07_StaticUtilJavaFaker;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.SmartBearUtils;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class c3_SmartBearTest {
    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Login
//4. Click on Order
//5. Select familyAlbum from product, set quantity to 5
//6. Click to "Calculate" button
//7. Fill address Info with JavaFaker
//8. Click on "visa" radio button
//9. Generate card number using JavaFaker
//10Enter expiration date
//11. Click on "Process"
//12.Verify success message "New order has been successfully


    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.loginSmartBear(driver);
    }
    @Test
    public void TC1(){
        // click on Order
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        Select dropdownProduct=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropdownProduct.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");

        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        Faker faker=new Faker();

        WebElement name=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        name.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replaceAll("-",""));

        WebElement visaButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));

        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        WebElement expDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));

        expDate.sendKeys("01/28");
        expDate.click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

        BrowserUtils.wait(2);
        WebElement successMessage=driver.findElement(By.xpath("//strong"));
        Assert.assertEquals(successMessage.getText(),"New order has been successfully added.");








    }
}
