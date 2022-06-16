package code.day11;

import code.base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driverutil;

public class c2_AlertPractice extends TestBase2 {

    /*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */

    @Test
    public void AlertPractice(){
        Driverutil.getDriver().get("http://the-internet.herokuapp.com/");
        WebElement jsAlertLink=Driverutil.getDriver().findElement(By.xpath("//a[text()='JavaScript Alerts']"));
        jsAlertLink.click();
        //Click for JS Prompt

        WebElement JsPromptLink=Driverutil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        JsPromptLink.click();

        //Enter "Hello World" text and Click okay
        Alert alert=Driverutil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(3);
        alert.accept();

        //Validate your text appearing on the page
        WebElement actualText=Driverutil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));
    }


}
