package Page;
import PageElements.CartPage;
import PageElements.WomenPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MainPage {
    public static void main(String[] args) {
        // Set up Chrome WebDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

       // Navigate to the Women's section
        driver.get("https://magento.softwaretestingboard.com/women.html");


        // Create instances of the element classes
        WomenPage womenPage = new WomenPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Perform the actions
        womenPage.filterByWomen();
//        womenPage.applyShoppingOptions("9"); // Assuming "9" is the value for a specific category

        // Hover over the "Tops and Bottoms" option
        womenPage.hoverOverTopsAndBottoms();

        // Click one of the options from the revealed dropdown (e.g., "Tops")
        womenPage.clickTopsOption();

        // Click the dropdown and select "Tops and Bottoms" section directly
        womenPage.selectTopsAndBottoms();


        // Select an option from the list (e.g., "Tops")
        womenPage.selectTopsOption();


        cartPage.addToCart();
        cartPage.sortItems("Price: Low to High"); // Provide the actual sorting criteria


        // Add assertions or further test steps as needed for validation

        // Close the browser
        driver.quit();
    }

}
