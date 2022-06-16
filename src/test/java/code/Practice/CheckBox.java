package code.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class CheckBox {

    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify checkbox1 is not selected
//4. Click to checkbox2
//5. Verify checkbox2 is selected

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver =WebDriverutil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));

        if (!checkBox1.isSelected()){
            System.out.println("CheckBox1 is not selected ");
        }else {
            System.out.println("CheckVox1  is selected, Verification has Failed");
        }

       WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();

        if (checkBox2.isSelected()){
            System.out.println("Verification has Passed");
        }else {
            System.out.println("Verification has Failed");
        }
        Thread.sleep(4000);
        driver.quit();

    }
}
