Feature: Sign Up
  As a end user
  I want to sign up to the site
  So that i can access website

  Scenario: User can Sign Up
    When I navigate to sign up
    Given I register with "test.naresh@gmail.com" and "password123"
    Then I should see message displayed as "Account created."

