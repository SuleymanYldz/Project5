package code.DropDownJavaFaker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverutil;

import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;

public class c1_DropDown {
//task1
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//confirm default selected dropdown is "Please select an option"

  WebDriver driver;

  @BeforeClass
    public void beforeClass(){
      System.out.println("Test is starting");
  }
  @AfterClass
    public void afterClass(){
      System.out.println("Test has completed");
  }
  @BeforeMethod
    public void setUp(){
      driver=WebDriverutil.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://the-internet.herokuapp.com/");
  }
  @Test

    public void TC1_verifyDropDown(){
      //3 click on dropdown

      System.out.println("Test1 is running");
      driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
    //confirm default selected dropdown is "Please select an option"
    WebElement dropDownBox=driver.findElement(By.id("dropdown"));
    //we use Select Method
    Select dropdown=new Select(dropDownBox);

    String defaultOption=dropdown.getFirstSelectedOption().getText();
    String expectedDefaultOption="Please select an option";
    Assert.assertEquals(defaultOption,expectedDefaultOption,"the default option verification has failed");

  }
  @Test
  public void TC2_VerifyOptionsFromDropDown() throws InterruptedException {

    System.out.println("test2 is running");
//task2
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//choose  option 2 from dropdown
//choose option 1 from dropdown
//choose option 2 from dropdown

    driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
    Select dropdown=new Select(driver.findElement(By.id("dropdown")));
    Thread.sleep(3000);
    dropdown.selectByVisibleText("Option 2");
    Thread.sleep(3000);
    dropdown.selectByValue("1");
    Thread.sleep(3000);
    dropdown.selectByIndex(2);

  }
  @AfterMethod
  public  void closing(){
    //driver.close();
  }
}
