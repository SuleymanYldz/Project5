package code.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driverutil;

import java.time.Duration;

public abstract class BasePage {

   protected WebDriverWait driverWait=new WebDriverWait(Driverutil.getDriver(), Duration.ofSeconds(20));

    public BasePage(){



            /*

IN POM Design you need to have some structure for each page :
1.PageFactory.initElements(driver, this);
      -> It creates connection in between driver and object of the class.
2. @FindBy annotation to locate webElements.
      -> Using this FindBy annotation, help us to locate web elements.
3. Create methods related webelements

     */
        PageFactory.initElements(Driverutil.getDriver(),this);
    }


}
