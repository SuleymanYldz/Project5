package code.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driverutil;

import java.util.concurrent.TimeUnit;


public class Task12 {

    /*
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
     //Click on the "Try it" button
      //Enter Your name on the Alert Box and Accept alert
      //Verify that your name shown on the page
       //Click on the 'home sign' (it is on the left side of page)
        //Switch to second window tab //Click on the "log in" button
        //Enter your credentials //Enter the show password button
        //Switch to first tab
     */


   @Test
    public void TC1(){
       Driverutil.getDriver().get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
       Driverutil.getDriver().switchTo().frame(0);

   }
}
