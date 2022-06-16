package code.RadioButtonAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverutil;

import java.util.concurrent.TimeUnit;

public class RadioButton {

    // Navigate to https://courses.letskodeit.com/practice
// click on BMW RADIO button
//   verify that its selected

    public static void main(String[] args) {


        WebDriver driver= WebDriverutil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

       WebElement BMWRadioButton= driver.findElement(By.id("bmwradio"));
       BMWRadioButton.click();

       boolean bmwRadioSelected=BMWRadioButton.isSelected();

       if (bmwRadioSelected){
           System.out.println("BMW is selected");
       }else {
           System.out.println("BMW is not selected");
       }



//Verify that Honda is not selected

       WebElement hondaRadioButton=driver.findElement(By.id("hondaradio"));


       if (!hondaRadioButton.isSelected()){
           System.out.println("Honda  is not selected and verificaton has Passed");
       }else {
           System.out.println("Honda is selected and  verification has Failed");
       }
    }
}
