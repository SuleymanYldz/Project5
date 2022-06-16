package code.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class javaFaker {


    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/gmail/");
    }
    @Test
    public void TC1(){

        driver.findElement(By.id("identifierId")).sendKeys("slymnyldz6327@gmail.com");
        WebElement next=driver.findElement(By.id("identifierNext"));
        next.click();
    }
}
