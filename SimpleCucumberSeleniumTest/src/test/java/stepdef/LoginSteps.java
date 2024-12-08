package stepdef;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.BrowserDriver;
import pages.LoginPage; // Ensure you have a corresponding page object for login

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        WebDriver driver = BrowserDriver.getDriver(); // Get the WebDriver instance
        loginPage = new LoginPage(driver); // Initialize LoginPage with the driver
    }

    @When("User successfully entered the login details")
    public void user_successfully_entered_the_login_details() {
        loginPage.enterUsername("yourUsername"); // Replace with actual username
        loginPage.enterPassword("yourPassword"); // Replace with actual password
        loginPage.clickLogin();
    }
}
