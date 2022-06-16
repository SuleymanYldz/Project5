package code.Locators;

import code.Locators.Locator_Id;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_name  {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        driver.findElement(By.name("p")).sendKeys("Suleyman");

        driver.findElement(By.id("ybar-search")).click();

    }
}
