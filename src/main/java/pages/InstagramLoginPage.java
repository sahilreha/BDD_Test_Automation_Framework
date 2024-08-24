package pages;

import driver_factory.DriverManager;
import genericMethods.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage {

    private final GenericFunctions genericFunctions;

    //Locator which are static in the nature
    private final By loginButton = By.xpath("//button[@type='submit']");
    private final By userNameTextField = By.xpath("//input[@type='text']");
    private final By passwordTextField = By.xpath("//input[@type='password']");
    private static final String URL = "https://www.instagram.com";

    public InstagramLoginPage() {
        WebDriver driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        this.genericFunctions = new GenericFunctions(driver);
    }

    public void launchInstagramApplication(){
        genericFunctions.launchTheUrl(URL);
    }

    public void enterUserName(String username) {
        genericFunctions.type(userNameTextField, username);
    }
    public void enterPassword(String password) {
        genericFunctions.type(passwordTextField, password);
    }

    public boolean isLoginButtonDisabled(){
        boolean result = false;

        //If disabled attribute will be there this condition will make it as true
        if(genericFunctions.getAttributeValue(loginButton, "Disabled").length()>0){
            result = true;
        }
        return result;
    }

    public boolean isLoginButtonEnabled(){
        return genericFunctions.isElementEnabled(loginButton);
    }

    public void clickOnLoginButton(){
        genericFunctions.click(loginButton);
    }

    public boolean isErrorMessageDisplay(String errorMessage){
        //Creating dynamic locator
        String locator = "//div[text()='"+ errorMessage +"']";
        WebElement errorMessageElement = genericFunctions.getCustomisedLocator(locator);
        boolean result = false;
        if(errorMessageElement.isDisplayed()){
            result = true;
        }
        return result;
    }
}
