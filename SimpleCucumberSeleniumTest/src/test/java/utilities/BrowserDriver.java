package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    private static BrowserDriver instance;
    private static WebDriver driver;
    private ChromeOptions options;

    // Private constructor to enforce Singleton pattern
    private BrowserDriver() {
        options = new ChromeOptions();
        // Add arguments based on your requirements
        options.addArguments("--start-maximized");
        if (Boolean.getBoolean("headless")) {
            options.addArguments("--headless");
        }

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = new BrowserDriver();
        }
        return driver;
    }

    public void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }
    }
}
