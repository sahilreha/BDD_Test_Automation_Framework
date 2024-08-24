package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.InstagramLoginPage;

public class LoginInstagramSteps {

    private final InstagramLoginPage loginPage;
    public LoginInstagramSteps() {
        loginPage = new InstagramLoginPage();
    }

    @Given("user launches the Instagram application")
    public void user_launches_the_instagram_application() {
        loginPage.launchInstagramApplication();
    }

    @When("user enters the username as {string}")
    public void user_enters_the_username_as(String username) {
        loginPage.enterUserName(username);
    }

    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("verify that the login button is disabled")
    public void verify_that_the_login_button_is_disabled() {
        Assert.assertTrue(loginPage.isLoginButtonDisabled(), "Login button is enabled!!");
    }

    @Then("verify that the login button is enabled")
    public void verify_that_the_login_button_is_enabled() {
        Assert.assertTrue(loginPage.isLoginButtonEnabled(),  "Login button is disabled!!");

    }
    @Then("verify that the error message displayed on the page is {string}")
    public void verify_that_the_error_message_displayed_on_the_page_is(String message) {
        Assert.assertTrue(loginPage.isErrorMessageDisplay(message),
                "No error message displayed on the page");
    }
}
