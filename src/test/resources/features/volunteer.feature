@run
Feature: Validating Volunteer functionality

  Scenario Outline: User wants to sign up for volunteering
    Given User navigates to home page
    And User clicks on volunteer button on home page
    Then User should be taken to volunteer page
    When User clicks on sign up button
    Then User should be taken to volunteer sign up page
    And User enters name <name>
    And User enters email <email>
    And User enters phone <phone>
    And User enters job title <job_title>
    And User enters industry <industry>
    And User enters area of interest <area_of_interest>
    When User clicks on submit button
    Then User should see success message

    Examples: 
      | name     | email           | phone      | job_title | industry | area_of_interest |
      | John Doe | john5@gmail.com | 1234567890 | SDET      | IT       | Mentor           |
