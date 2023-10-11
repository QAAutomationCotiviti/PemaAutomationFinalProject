package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    // add to cart

    public void addToCart() {
//        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(), 'Add to Cart')]"));
//        addToCartButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // You can adjust the timeout as needed
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Add to Cart']")));
        addToCartButton.click();

    }
    public void verifyCartContents() {
        // ...
    }

    public void proceedToCheckout() {
        // ...
    }

    public void sortItems(String sortCriteria) {
        // Add code to select sorting criteria from a dropdown
    }

}
