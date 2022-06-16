package StudyHallPPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class LocatorsPractice {
    WebDriver driver;

    @Test
    public void TC1searchForEarrings(){
        //Search for earrings
        // Add some filters to search

        WebDriverManager.chromedriver().setup();
         driver= WebDriverutil.getDriver("chrome");

        driver.get("https://www.etsy.com/ca/");
        WebElement searchBox=driver.findElement(By.id("global-enhancements-search-query"));
       searchBox.sendKeys("earring");
        WebElement searchButton =driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        // Second Way
       //searchBox.sendKeys("earrings"+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expectedUrl="earrings";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Test
    public void TC2_AddFilters(){

        WebElement ClickFilterButton=driver.findElement(By.id("search-filter-button"));


    }
}
