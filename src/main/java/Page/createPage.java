package Page;
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageElements.CreateAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import utilities.utility;



public class createPage {
    private WebDriver driver;

    // Constructor that accepts a WebDriver instance
    public createPage(WebDriver driver) {
        this.driver = driver;
    }

    public void main(String[] args) {
        // Set up Chrome WebDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

//        driver.manage().window().maximize();

        // Navigate to the Magento website registration page using the shared WebDriver instance
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

//
//        driver.get("https://magento.softwaretestingboard.com/");

        // Initialize the CreateAccountPage
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        // Navigate to the Magento website registration page
//        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        // Test scenario
        createAccountPage.enterFirstName("Pema");
        createAccountPage.enterLastName("Lama");
        createAccountPage.enterEmail("test11@gmail.com");
        createAccountPage.enterPassword("Pema@123");
        createAccountPage.confirmPassword("Pema@123");
        createAccountPage.clickCreateAccountButton();

        WebElement womenSectionLink = driver.findElement(By.linkText("Women"));
        womenSectionLink.click();



        // Close the browser
//        driver.quit();
    }
}
