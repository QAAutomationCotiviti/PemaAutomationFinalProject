package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class WomenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WomenPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void filterByWomen() {
        WebElement womenFilter =  driver.findElement(By.xpath("//span[text()='Women']"));
        womenFilter.click();

//        WebElement topsOption = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tops")));
        WebElement topsOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Tops']")));

        topsOption.click();
    }



    public void hoverOverTopsAndBottoms() {
        // Wait for the "Tops and Bottoms" option to become visible
//
        WebElement ele = driver.findElement(By.xpath("//span[text()='Women']"));

        // Perform the hover action
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
    }


    public void clickTopsOption() {
//        WebElement topsOption = driver.findElement(By.linkText("Tops"));
        WebElement topsOption = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tops")));

        topsOption.click();
    }

//    public void selectTopsAndBottoms() {
//        WebElement dropdown = driver.findElement(By.id("category_id"));
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Tops and Bottoms");
//    }

//    public void selectTopsOption() {
//        WebElement topsOption = driver.findElement(By.linkText("Tops"));
//        topsOption.click();
//    }


//    public void clickOnTopItems(String itemName) {
//        // Wait for the item to become clickable and click on it
//        WebElement item = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(itemName)));
//        item.click();
//    }
}
