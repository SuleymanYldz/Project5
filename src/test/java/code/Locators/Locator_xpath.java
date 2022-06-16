package code.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        driver.findElement(By.xpath("//input[@id=\"ybar-sbq\"]")).sendKeys("Suleyman");
       driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
    }
}
