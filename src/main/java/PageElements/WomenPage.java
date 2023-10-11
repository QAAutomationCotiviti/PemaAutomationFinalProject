package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
//    scrollIntoView(specificItem);

}
