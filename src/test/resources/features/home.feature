Feature: Validating Home page functionality

  Scenario: I want to validate home page functionality - Happy Path
    Given I navigate to home page on the website
    And I click on the Apply Now button on home page
    Then I should be taken the successful applicant page
    And I click on the Career Center on navigation bar
    Then I should be taken the successful home page
    And I click on the Login button on home page
    Then I should be taken the successful login page
    And I click on the Career Center on navigation bar
    Then I should be taken the successful home page
    And I click on the Contact us button on home page
    Then I should be taken the successful applicant page
    And I click on the Career Center on navigation bar
    Then I should be taken the successful home page
    And I click on the Sign up button on home page
    Then I should be taken the successful volunteer page
