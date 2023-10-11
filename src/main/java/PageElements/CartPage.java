package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Add to Cart']")));
        addToCartButton.click();

    }
    public void clickCartIcon() {
        WebElement cartIcon = driver.findElement(By.cssSelector("a.action.showcart"));
        cartIcon.click();

    }
    public void viewCartItems() {
//        WebElement viewCartButton = driver.findElement(By.cssSelector("a.action.viewcart"));
//        viewCartButton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement viewCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.action.viewcart")));
//        viewCartButton.click();
        WebElement viewCartButton = driver.findElement(By.cssSelector("a.action.viewcart"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewCartButton);
        viewCartButton.click();


    }

    public void proceedToCheckout() {
        WebElement checkoutButton = driver.findElement(By.cssSelector("button[data-role='proceed-to-checkout']"));
        checkoutButton.click();

    }
//    public void verifyCartContents() {
//
//    }


}
