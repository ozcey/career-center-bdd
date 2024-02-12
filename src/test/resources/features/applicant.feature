Feature: Validating Applicant functionality
	@run
  Scenario: User wants to apply for new applicant
    Given User clicks on applicant button on home page
    Then User should be taken to applicant page
    When User clicks on apply now button
    Then User should be taken to application form page
    And User fills out contact info
      | first_name | John             |
      | last_name  | Doe              |
      | phone      |       1234567890 |
      | email      | john01@gmail.com |
    And User clicks on next button on contact form
    And User fills out address info
      | street  | 123 Elm Dr |
      | city    | Irvine     |
      | state   | CA         |
      | zipcode |      12345 |
    And User clicks on next button on address form
    And User fills out job details info
      | area_of_interest | IT               |
      | age              |               34 |
      | gender           | Male             |
      | degree           | Bachelors Degree |
      | language         | English          |
    And User clicks on next button on job details form
    Then User should be taken to submit page
    When User clicks on submit button on the page
    Then User should get success message
