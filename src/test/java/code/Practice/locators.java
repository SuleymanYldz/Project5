package code.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");

        // Xpath second way //tagname[@SoftwareTesting
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul[1]/li/a")).click();

    }
}
