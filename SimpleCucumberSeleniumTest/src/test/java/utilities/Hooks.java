package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    @Before
    public void setUp() {
        BrowserDriver.getDriver(); // Ensure driver is initialized
    }

//    @After
 //   public void tearDown() {
  //      BrowserDriver.getDriver().quit(); // Properly quit the driver
  //  }
}
