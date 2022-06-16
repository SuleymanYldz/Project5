package code.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Findelements {

    public static void main(String[] args) {
        //1. Open Chrome browser
//2. Go to https://www.apple.com
//3. Click to iPhone
//4. Print out the texts of all links

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.apple.com");

        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //print out all links
        //count of links that doesnt have text
        //count of links that has text
        //a tag has all the link//I am using tag name locator

        List<WebElement>allLinks=driver.findElements(By.tagName("a"));

        int LinkWithText=0;
        int LinkWithoutText=0;

      for (WebElement eachLink:allLinks){
          String elementtoText=eachLink.getText();
          System.out.println(elementtoText);

          if (elementtoText.isEmpty()){
              LinkWithoutText++;

          }else {
              LinkWithText++;
          }
      }
        System.out.println("Link with Text = " + LinkWithText);
        System.out.println("Link without Text = "+ LinkWithoutText);
        System.out.println("All link size  "+ allLinks.size());
    }
}
