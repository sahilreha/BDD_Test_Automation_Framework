package genericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericFunctions {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public GenericFunctions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    // Get WebElement
    public WebElement getWebElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Click on an element
    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    // Type text into an element
    public void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    // Check if an element is displayed
    public boolean isElementDisplayed(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.isDisplayed();
    }

    // Check if an element is enabled
    public boolean isElementEnabled(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.isEnabled();
    }


    // Get Value for that attribute
    public String getAttributeValue(By by, String value){
           WebElement element = getWebElement(by);
           return element.getAttribute(value);
    }

    //Launch the application
    public void launchTheUrl(String url){
        driver.get(url);
    }

    //Create own locator
    public WebElement getCustomisedLocator(String locator){
        WebElement element =  driver.findElement(By.xpath(locator));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
