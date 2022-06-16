package code.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Classname {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.get("https://login.yahoo.com/");


        driver.findElement(By.className("phone-no")).sendKeys("slymnyldz6327@gmail.com");
        driver.findElement(By.className("pure-button puree-button-primary challenge-button")).click();
    }
}
