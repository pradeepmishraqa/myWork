package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private static final By HAMBURGER_MENU = By.xpath("//*[@id='menuToggle']/input");
    private static final By SIGNIN_LINK = By.xpath("//*[@id='menu']/a[2]/li");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(10)); // 10 seconds timeout
    }

    public void clickHamburgerMenu() {
         wait.until(ExpectedConditions.elementToBeClickable(HAMBURGER_MENU)).click();
        System.out.println("Hamburger menu is clicked");
    }

    public void clickSigninLink() {
        wait.until(ExpectedConditions.elementToBeClickable(SIGNIN_LINK)).click();
    }
}
