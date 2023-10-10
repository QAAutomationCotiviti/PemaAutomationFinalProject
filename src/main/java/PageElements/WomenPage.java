package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class WomenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WomenPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//

    }

    public void filterByWomen() {
        WebElement womenFilter = driver.findElement(By.linkText("Women"));
        womenFilter.click();

        WebElement topsOption = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tops")));

        topsOption.click();
    }

//    public void applyShoppingOptions(String category) {
//        Select categoryDropdown = new Select(driver.findElement(By.id("category_id")));
//        categoryDropdown.selectByValue(category);
//    }

    public void hoverOverTopsAndBottoms() {
        WebElement topsAndBottomsOption = driver.findElement(By.linkText("Tops and Bottoms"));
        Actions actions = new Actions(driver);
        actions.moveToElement(topsAndBottomsOption).perform();
    }

    public void clickTopsOption() {
        WebElement topsOption = driver.findElement(By.linkText("Tops"));
        topsOption.click();
    }

    public void selectTopsAndBottoms() {
        WebElement dropdown = driver.findElement(By.id("category_id"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Tops and Bottoms");
    }

    public void selectTopsOption() {
        WebElement topsOption = driver.findElement(By.linkText("Tops"));
        topsOption.click();
    }
}
