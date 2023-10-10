package Page;
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageElements.CreateAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import utilities.utility;



public class createPage {

    public static void main(String[] args) {
        // Set up Chrome WebDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");

        // Initialize the CreateAccountPage
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        // Navigate to the Magento website registration page
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        // Test scenario
        createAccountPage.enterFirstName("Pema");
        createAccountPage.enterLastName("Lama");
        createAccountPage.enterEmail("pema.lama11@gmail.com");
        createAccountPage.enterPassword("Pema@123");
        createAccountPage.confirmPassword("Pema@123");
        createAccountPage.clickCreateAccountButton();

        WebElement womenSectionLink = driver.findElement(By.linkText("Women"));
        womenSectionLink.click();

        // Add assertions or further test steps as needed

        // Close the browser
//        driver.quit();
    }
}
