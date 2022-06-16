package code.day11;

import code.base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driverutil;
import utilities.PropertiesReadingUtil;

public class c1_driverUtilPractice extends TestBase2 {
//go to google
//search for hello
//veriffy title contains helllo

    @Test
    public void TC1(){
        Driverutil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox=Driverutil.getDriver().findElement(By.name("q"));

        String searchItem=PropertiesReadingUtil.getProperties("google_search_date");
        searchBox.sendKeys(searchItem+ Keys.ENTER);

        BrowserUtils.wait(5);
        Assert.assertTrue(Driverutil.getDriver().getTitle().contains(searchItem));
    }


}
