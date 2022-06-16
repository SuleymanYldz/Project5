package code.generalPratic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFacebookVerification {


//TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile



    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        driver.getTitle();
        String expectedTitle= driver.getTitle();
        System.out.println("Title is :" + driver.getTitle());


        System.out.println("*****************************************");

        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver2=new ChromeDriver();

        //Go to google
        driver2.get("https://www.google.com/");
        driver2.manage().window().maximize();

        Thread.sleep(5000);

        //Navigate back
        driver2.navigate().back();

        Thread.sleep(4000);

        //Navigate forward
        driver2.navigate().forward();

        //Navigate to https://www.amazon.com
        driver2.navigate().to("https://www.amazon.com");
        driver2.close();

        String expectedTitle2="Smile";
        String actualTitle= driver2.getTitle();

        if (actualTitle.contains(expectedTitle2)){
            System.out.println("Title Verification has Passed");
        }else {
            System.out.println("Title verification has Failed");
        }

        System.out.println("Title is : " + driver2.getTitle());

    }
}
