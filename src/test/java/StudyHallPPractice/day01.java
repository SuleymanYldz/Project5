package StudyHallPPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.name("search_query"));
        WebElement searchBox=driver.findElement(By.name("search_query"));
        searchBox.sendKeys("T-shirt");
        WebElement searchButton=driver.findElement(By.name("submit_search"));
        searchButton.click();

        // second way
       // driver.findElement(By.name("search_query")).sendKeys("T-shirt"+ Keys.ENTER);


        String expectedTitle="Search - My Store";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.close();
        driver.quit();
    }
}
