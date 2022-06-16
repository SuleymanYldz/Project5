package code.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class impicitWait {

    public static void main(String[] args) {

        WebDriver driver= WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("a[href='/attend/']")).click();

    }
}
