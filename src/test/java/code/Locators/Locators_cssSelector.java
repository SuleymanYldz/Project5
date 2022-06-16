package code.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_cssSelector {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        driver.findElement(By.cssSelector("#ybar-sbq")).sendKeys("Suleyman");
        driver.findElement(By.cssSelector("#ybar-search")).click();
    }
}
