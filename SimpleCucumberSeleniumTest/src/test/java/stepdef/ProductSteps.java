package stepdef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ProductPage;
import utilities.BrowserDriver;

import java.time.Duration;


public class ProductSteps {

    private WebDriver driver;
    private ProductPage ProductPage;
    private WebDriverWait wait;

    public ProductSteps() {

        driver = BrowserDriver.getDriver();
        ProductPage = new ProductPage(driver);
        wait = new WebDriverWait(driver, Duration.ofMillis(10));
    }

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws Throwable {
        Thread.sleep(2000);
        ProductPage.productAvilable();

    }
}
