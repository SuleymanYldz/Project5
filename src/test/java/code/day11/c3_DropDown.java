package code.day11;

import code.base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driverutil;

public class c3_DropDown extends TestBase2 {


    @Test
    public void TC1_DropDown(){

        Driverutil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropDown=Driverutil.getDriver().findElement(By.id("countryDropdown"));
        dropDown.sendKeys("Canada");
        BrowserUtils.wait(5);
        dropDown.sendKeys(Keys.ARROW_DOWN);
        dropDown.sendKeys(Keys.ENTER);
    }
}
