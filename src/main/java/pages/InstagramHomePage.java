package pages;

import driver_factory.DriverManager;
import genericMethods.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InstagramHomePage {
    private final GenericFunctions genericFunctions;

    By homeIcon = By.xpath("//span[contains(text(),'Home')]");
    By searchIcon = By.xpath("//span[contains(text(),'Search')]");
    By exploreIcon = By.xpath("//span[contains(text(),'Explore')]");

    public InstagramHomePage(){
        WebDriver driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        this.genericFunctions = new GenericFunctions(driver);
    }


    public boolean isHomeIconPresent() {
       return genericFunctions.isElementDisplayed(homeIcon);
    }

    public boolean isSearchIconPresent(){
        return genericFunctions.isElementDisplayed(searchIcon);
    }
    public boolean isExploreIconPresent(){
        return genericFunctions.isElementDisplayed(exploreIcon);
    }


}
