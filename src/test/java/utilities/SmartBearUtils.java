package utilities;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void loginSmartBear(WebDriver driver){
//3- Enter username --->Tester
//4- Enter password --->test
//5- Click "Login" button
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
    }
    public static void negativeLoginSmartBear(WebDriver driver,String userID,String PasswordID){
//3- Enter username --->Tester
//4- Enter password --->test
//5- Click "Login" button
        //invalid userid
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        //invalid passwordID
        password.sendKeys(PasswordID);
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
    }

    public static void verifyStreet(WebDriver driver,String streetName){

        // to locate ll table ://table[@id='ctl00_MainContent_orderGrid']
        // to locate all table row ://table[@id='ctl00_MainContent_orderGrid']//tr
        // to locate 4. row://table[@id='ctl00_MainContent_orderGrid']//tr[4]
        // to locate all street ://table[@id='ctl00_MainContent_orderGrid']//tr//td[6]

        List<WebElement>streetList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
        for (WebElement eachStreet: streetList){
            if (eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }

        }
        Assert.fail("Street name : "+ streetName+ " is not present on table");
    }

}
