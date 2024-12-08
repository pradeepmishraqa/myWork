import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.getProperty("driver.chrome.driver","E:/myWork/DemoProject/chromedriver.exe");

        WebDriver driver  = new ChromeDriver();
        
        driver.get("www.google.com");





    }
}