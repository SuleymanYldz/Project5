package code.generalPratic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAmazon {

    //Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile


    public static void main(String[] args) throws InterruptedException {

        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Go to google
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        //Navigate back
        driver.navigate().back();

        Thread.sleep(4000);

        //Navigate forward
        driver.navigate().forward();

        //Navigate to https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

        String expectedTitle="Smile";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification has Passed");
        }else {
            System.out.println("Title verification has Failed");
        }

        System.out.println("Title is : " + driver.getTitle());

    }
}
