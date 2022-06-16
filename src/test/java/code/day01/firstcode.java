package code.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcode {

    public static void main(String[] args) {

        System.out.println("hello World");
        // set up from driver
        WebDriverManager.chromedriver().setup();

        // create a driver instance
        WebDriver driver=new ChromeDriver();

        // navigate to chrome browser
        driver.get("https://www.etsy.com/");
    }
}
