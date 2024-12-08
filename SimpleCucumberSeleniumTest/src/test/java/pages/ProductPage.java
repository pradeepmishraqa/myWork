package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Locator
    private static final By SHOE_TYPE = By.xpath("//*[@id=\"ShoeType\"]");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofMillis(500));
    }

    public  void productAvilable() {
        List list = Collections.singletonList(wait.until(ExpectedConditions.visibilityOfElementLocated(SHOE_TYPE)).getText());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
