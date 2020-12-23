Feature: Validating Applicant page functionality

  @Run
  Scenario: I want to validate application form functionality - Happy Path
    Given I navigate to home page on the website
    And I click on the Apply Now button on home page
    Then I should be taken the successful applicant page
    And I enter a valid first name
    And I enter a valid last name
    And I enter a valid phone
    And I enter a valid email
    When I click on the next button on the contact page
    Then I should be taken the successful address form
    And I enter a valid street name
    And I enter a valid city
    And I enter a valid state
    And I enter a valid zip code
    When I click on the next button on the address page
    Then I should be taken the successful job details form
    And I click on the Areas of Interest dropdown menu
    And I select a value in Areas of Interest
    And I enter a valid age
    And I click on the Gender dropdown menu
    And I select a value in gender
    And I enter a valid degree
    And I click on the Languages dropdown menu
    And I select a value in languages
    When I click on the next button on the job details page
    Then I should be taken the successful done page
    When I click on the submit button
    Then I should see successful message on the page