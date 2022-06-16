package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleVerification {

    //Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

    public static void main (String []args) throws  Exception{


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com/");
        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(400);
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com/");

        String expectedResult="Smile";
        String actualResult=driver.getTitle();
        String title=driver.getTitle();

        if (title.contains("Smile")){
            System.out.println("Verification  passed  succesfully");
        }else {
            System.out.println("Verification  Failed");
        }
        System.out.println("Title is :" + driver.getTitle());
        driver.close();

    }
}
