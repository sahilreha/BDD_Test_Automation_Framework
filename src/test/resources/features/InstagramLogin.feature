@smoke
Feature: Instagram Login Page

  Background:
    Given user launches the Instagram application

    @smoke
  Scenario: Verify that the user is able to log in with valid credentials
    When user enters the username as "rimepew353@inpsur.com"
    And user enters the password as "br@vePink0912"
    And user clicks on the login button
    Then verify that the user has successfully landed on the homepage

  @smoke
  Scenario: Verify that the login button is disabled until the user enters a username and password
    Then verify that the login button is disabled
    And user enters the username as "rimepew353@inpsur.com"
    And user enters the password as "br@vePink0912"
    Then verify that the login button is enabled

  @smoke
  Scenario: Verify that login fails with invalid password
    When user enters the username as "rimepew353@inpsur.com"
    And user enters the password as "invalid_password"
    And user clicks on the login button
    Then verify that the error message displayed on the page is "Sorry, your password was incorrect. Please double-check your password."

  @smoke
  Scenario: Verify that login fails with invalid username
    When user enters the username as "invalid_username"
    And user enters the password as "br@vePink"
    And user clicks on the login button
    Then verify that the error message displayed on the page is "Sorry, your password was incorrect. Please double-check your password."
