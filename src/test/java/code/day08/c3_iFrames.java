package code.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class c3_iFrames {
//1- Open a chrome browser
//2- Go to:http://the-internet.herokuapp.com/iframe
//3- Switching by id or name attribute value.

    WebDriver driver;
    @BeforeMethod
    public void setup(){

        driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void TC1_iframe(){

        driver.switchTo().frame("mce_0_ifr");
        WebElement MessageBox=driver.findElement(By.id("tinymce"));
        MessageBox.clear();
        MessageBox.sendKeys("King of the North");

        driver.switchTo().defaultContent(); // return to the main html
       // driver.switchTo().parentFrame(); // in order to return previous html
    }
}
