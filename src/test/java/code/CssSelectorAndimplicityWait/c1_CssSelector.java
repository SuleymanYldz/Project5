package code.CssSelectorAndimplicityWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        // first way
//        driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("bug spray");
        // second way
        //  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Shoes");
        //third way (# means id in css)
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("TV");


       }
}
