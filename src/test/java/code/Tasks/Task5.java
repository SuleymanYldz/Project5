package code.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class Task5 {

    //Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)

    WebDriver driver;

   @BeforeMethod
    public void setup(){
       driver= WebDriverutil.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.amazon.com/");
   }
   @Test
    public void TC1(){
      WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
      searchBox.sendKeys("desk", Keys.ENTER);

   }
}
