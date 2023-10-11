package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class sorting {

    private WebDriver driver;
    private WebDriverWait wait;
//    private By sortingLink = By.id("sorter");


    public sorting(WebDriver driver, WebDriverWait wait) {
        this.wait = wait;
        this.driver = driver;
    }


    public void performSorting() {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='sorter']")));
        Select dropdown = new Select(el);
        dropdown.selectByIndex(2);
    }
}
