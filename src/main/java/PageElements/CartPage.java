package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(), 'Add to Cart')]"));
        addToCartButton.click();
    }

    public void sortItems(String sortCriteria) {
        // Add code to select sorting criteria from a dropdown
    }
}
