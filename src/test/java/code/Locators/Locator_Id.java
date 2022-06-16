package code.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id {

    public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.yahoo.com/");


    WebElement searchBox=driver.findElement(By.id("ybar-sbq"));

    searchBox.sendKeys("Suleyman Yildiz");

    WebElement searchButton=driver.findElement(By.id("ybar-search"));
        searchButton.click();


    }
}
