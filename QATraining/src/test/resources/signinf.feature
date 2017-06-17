@tag0

Feature: session5

    @tag1
    Scenario Outline: add some meaningful scenario name here.
        Given I enter easyjet url
        And I signed in with "<email>","<password>"
        Then I should see sing in button

        Examples:
            | email              | password    |
            | testqa@hotmail.com | password123 |
#            | test12@gmail.com   | password434 |



    @tag1
    Scenario Outline: add some meaningful scenario name here1.
        Given I enter easyjet url
        And I signed in with "<email>","<password>"
        Then I should see sing in button

        Examples:
            | email              | password    |
            | testqa@hotmail.com | password123 |
#            | test12@gmail.com   | password434 |


