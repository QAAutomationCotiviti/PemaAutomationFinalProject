package Page;
import PageElements.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;


public class MainPage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        // Initialize the CreateAccountPage
        PageElements.CreateAccountPage createAccountPage = new PageElements.CreateAccountPage(driver);
        // Create an instance of the createPage class and pass the WebDriver instance
        createPage createPageInstance = new createPage(driver);
        // Create instances of the element classes
        WomenPage womenPage = new WomenPage(driver);
        sorting sort = new sorting(driver, wait);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to homepage section
        driver.get("https://magento.softwaretestingboard.com/");

        // Call the main method of the createPage instance
        createPageInstance.main(new String[]{});

        // Perform the actions
        womenPage.filterByWomen();
        womenPage.hoverOverTopsAndBottoms();
        womenPage.clickTopsOption();
//        womenPage.selectTopsAndBottoms();
//        womenPage.selectTopsOption();


        // sorting call
        sort.performSorting();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);

        // Now, call the new ProductPage to select product options and add to cart
        productPage.selectProductOptions("Product Name", "Medium", "Blue", "2");

        // Add the item to the cart using the CartPage
        cartPage.addToCart();


        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")));

        // Click the cart icon to open the popup
        cartPage.clickCartIcon();

        // Click "View Cart" to navigate to the cart page
        cartPage.viewCartItems();

        // Proceed to checkout from the cart page
        cartPage.proceedToCheckout();

        // Add the item to the cart
//        cartPage.addToCart();

        // Close the browser
//        driver.quit();
    }

}

