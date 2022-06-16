package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {

    //Task
//1.Open Chrome Browser
//2.Go to google
//3.Verify title : Expected : Google

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();


        Thread.sleep(2000);
        driver.get("https://www.google.com/");

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("google title verification Passed");
        }else {
            System.out.println("google title verification fAiled");
        }
        System.out.println("Actual Title : " + actualTitle);
        driver.close();

    }
}
