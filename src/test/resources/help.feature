@help
Feature: help page

    @helppage1
    Scenario Outline: help page
        Given I enter url "https://www.easyjet.com/en/"
        When I clicked on help menu
        And Should be display page "easyJetHelp"
        When I click "<helpPageTopics>"
        Then I should see "<ExpectedPageHeader>"

        Examples:
            | helpPageTopics | ExpectedPageHeader           |
            | Help Homepage  | What would you like to know? |
#            | Bag allowance   | Cabin bags and hold luggage  |
#            | Check-in online | something                    |

    @helppage
    Scenario Outline: help page
        Given I enter url "https://www.easyjet.com/en/"
        When I clicked on help menu
        Then I should see helppagetopics "<helpPageTopics>"

        Examples:
            | helpPageTopics                               |
            | Help Homepage, Bag allowance,Check-in online |


    @search
    Scenario Outline: search for a topic
        Given I enter url "https://www.easyjet.com/en/"
        When I clicked on help menu
        And I enter "<searchTopic>"
#        And I click search button
        Then I should see "<searchTopic>" in a new page

        Examples:
            | searchTopic     |
            | cancel a flight |

