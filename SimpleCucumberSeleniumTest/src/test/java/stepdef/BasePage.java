package stepdef;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserDriver;
import pages.HomePage;

import java.time.Duration;

public class BasePage {

    private HomePage homePage;
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        driver = BrowserDriver.getDriver(); // Get the WebDriver instance
        homePage = new HomePage(driver); // Initialize HomePage with the driver
        wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Set a wait time of 10 seconds
    }

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() throws Throwable {
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='menu']/a[2]/li")).click();
    }
}
