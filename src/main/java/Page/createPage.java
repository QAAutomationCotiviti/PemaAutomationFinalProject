package Page;
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageElements.CreateAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import utilities.utility;



public class createPage {
    private static WebDriver driver;
    public createPage(WebDriver driver) {
        this.driver = driver;
    }

    public  static void main(String[] args) {

        // Navigate to the Magento website registration page using the shared WebDriver instance
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

//
//        driver.get("https://magento.softwaretestingboard.com/");

        // Initialize the CreateAccountPage
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        // Navigate to the Magento website registration page
//        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        // Test scenario
        createAccountPage.enterFirstName("Qa");
        createAccountPage.enterLastName("Tester");
        createAccountPage.enterEmail("qatesting@gmail.com");
        createAccountPage.enterPassword("Pema@123");
        createAccountPage.confirmPassword("Pema@123");
        createAccountPage.clickCreateAccountButton();

        WebElement womenSectionLink = driver.findElement(By.linkText("Women"));
        womenSectionLink.click();



        // Close the browser
//        driver.quit();
    }
}
