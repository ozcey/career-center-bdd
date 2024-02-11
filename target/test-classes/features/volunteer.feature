Feature: Validating Volunteer functionality

  @run
  Scenario: User wants to sign up for volunteering
    Given User navigates to home page
    And User clicks on volunteer button on home page
    Then User should be taken to volunteer page
    When User clicks on sign up button
    Then User should be taken to volunteer sign up page
    And User fills out sign up form
      | name             | John  Doe        |
      | email            | john11@gmail.com |
      | phone            |       1234567890 |
      | job_title        | john@gmail.com   |
      | password         | SDET             |
      | industry         | IT               |
      | area_of_interest | Mentor           |
    When User clicks on submit button
    Then User should see success message
