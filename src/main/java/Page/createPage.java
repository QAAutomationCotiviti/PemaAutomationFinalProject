package Page;
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageElements.CreateAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.utility;

import java.time.Duration;


public class createPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public createPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void main(String[] args) {

        // Navigate to the Magento website registration page using the shared WebDriver instance
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

//
//        driver.get("https://magento.softwaretestingboard.com/");

        // Initialize the CreateAccountPage
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        // Navigate to the Magento website registration page
//        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        // Test scenario
        createAccountPage.enterFirstName("XYZqwe");
        createAccountPage.enterLastName("Surname123");
        createAccountPage.enterEmail("testin777@gmail.com");
        createAccountPage.enterPassword("Testinggg@123");
        createAccountPage.confirmPassword("Testinggg@123");
        createAccountPage.clickCreateAccountButton();

    }
}
