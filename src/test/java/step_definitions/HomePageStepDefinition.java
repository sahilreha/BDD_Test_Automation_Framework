package step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InstagramHomePage;

public class HomePageStepDefinition {

    private final InstagramHomePage homePage;

    public HomePageStepDefinition(){
        homePage = new InstagramHomePage();
    }
    @Then("verify that the user has successfully landed on the homepage")
    public void verify_that_the_user_has_successfully_landed_on_the_homepage() {
        Assert.assertTrue(homePage.isHomeIconPresent(),
                "Home icon is not displayed after login into the application");
        Assert.assertTrue(homePage.isSearchIconPresent(),
                "Search icon is not displayed after login into the application");
        Assert.assertTrue(homePage.isExploreIconPresent(),
                "Explore icon is not displayed after login into the application");
    }
}
