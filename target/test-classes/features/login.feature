
Feature: Validating Login functionality


  Scenario Outline: User wants to log in to account with valid credentials
    Given User navigates to home page
    And User clicks on login button on home page
    Then User should be taken to login page
    And User enters a valid username <username>
    And User enters a valid password <password>
    When User clicks on login button
    Then User should be taken to user page

    Examples: 
      | username | password |
      | admin    | password |

  Scenario Outline: User wants to log out of account
    Given User navigates to home page
    And User clicks on login button on home page
    Then User should be taken to login page
    And User enters a valid username <username>
    And User enters a valid password <password>
    When User clicks on login button
    Then User should be taken to user page
    When User clicks on logout button
    Then User should be taken to login page

    Examples: 
      | username | password |
      | admin    | password |
