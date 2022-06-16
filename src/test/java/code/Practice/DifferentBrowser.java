package code.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DifferentBrowser {

    public static void main(String[] args) {

       // WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();
        //driver.get("https://www.google.com");


        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

        driver.get("https://www.google.com");

    }
}
