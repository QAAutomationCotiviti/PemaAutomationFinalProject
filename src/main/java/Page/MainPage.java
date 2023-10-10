package Page;
import PageElements.CartPage;
import PageElements.WomenPage;
import PageElements.sorting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;




public class MainPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to homepage section
        driver.get("https://magento.softwaretestingboard.com/");
        //create page call
        // Create an instance of the createPage class
//

        // Initialize the CreateAccountPage
        PageElements.CreateAccountPage createAccountPage = new PageElements.CreateAccountPage(driver);

        // Create an instance of the createPage class and pass the WebDriver instance
        createPage createPageInstance = new createPage(driver);

        // Call the main method of the createPage instance
//        createPageInstance.main(new String[]{});



        // Locate the "Women" link
        WebElement womenLink = driver.findElement(By.xpath("//span[text()='Women']"));
        womenLink.click();

        // Create instances of the element classes
        WomenPage womenPage = new WomenPage(driver);
        CartPage cartPage = new CartPage(driver);
        sorting sort = new sorting(driver, wait);

        // Perform the actions
        womenPage.filterByWomen();
        womenPage.hoverOverTopsAndBottoms();
        womenPage.clickTopsOption();
//        womenPage.selectTopsAndBottoms();
//        womenPage.selectTopsOption();


        // sorting call
        sort.performSorting();

        // Add the item to the cart
//        cartPage.addToCart();

        // Close the browser
//        driver.quit();
    }

}

