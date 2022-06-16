package code.RadioButtonAndTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGExample2 {


    @BeforeClass

    public void setupClass(){
        System.out.println("Before class is running");

    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After class is running");
    }
    @BeforeMethod

    public  void setup(){
        System.out.println("Before method is running");
    }
    @AfterMethod

    public void closing(){
        System.out.println("After method is  running");
    }

    @Test(priority = 3, dependsOnMethods = "TC3")
    public void TC1(){
        System.out.println("Test1 is running");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("Test3 is running");
        String actualCar="Honda";
        String expectedCar="Ferrari";
        Assert.assertEquals(expectedCar,actualCar);
        System.out.println("Assertion for cars has Passed");
    }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test2 is running");
        String country1="USA";
        String country2="USA";
        Assert.assertEquals(country1,country2);
    }
    @Ignore
    @Test
    public void TC4(){
        System.out.println("Test4 is running");
    }
}
