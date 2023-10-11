package PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectProductOptions(String size, String color, String quantity, String number) {
        // Select size
        selectSize(size);

        // Select color
        selectColor(color);

        // Set quantity
//        setQuantity(quantity);
    }

    private void selectSize(String size) {
        WebElement  sizeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("option-label-size-143-item-167")));
//        WebElement sizeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-size-143-item-167']")));
//        Select sizeSelect = new Select(sizeDropdown);
//        sizeSelect.selectByVisibleText(size);
        sizeElement.click();
    }

    private void selectColor(String color) {
//        WebElement colorDropdown = driver.findElement(By.id("color")); // Replace with actual ID
//        Select colorSelect = new Select(colorDropdown);
//        colorSelect.selectByVisibleText(color);
        WebElement colorElement = driver.findElement(By.id("option-label-color-93-item-56")); // Replace with actual ID
        colorElement.click();
    }

//    private void setQuantity(String quantity) {
////        WebElement quantityInput = driver.findElement(By.id("qty"));
//        WebElement quantityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qty")));
//
//        quantityInput.clear();
//        quantityInput.sendKeys(quantity);
//    }


}
