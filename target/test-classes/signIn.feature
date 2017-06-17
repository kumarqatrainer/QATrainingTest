Feature: Holidays

#    Here I am using Background because.. for every scenario we are using 2 lines as a starting of the scenario (check below commented steps).
#    so no need to repeat the step or steps for every scenario.
# every scenario, it will check for Background and executed the scenario or scenario outline.
#    for ex: for scenario-1: Background and then Line number 20. for Scenario-2: Background and then line number 27,28,29,30,31. etc.
#https://github.com/cucumber/cucumber/wiki/Background



    Background:
        Given I enter url "https://www.easyjet.com/en/"
        And I click on "Holidays"


    Scenario: Holidays Main page
#        Given I enter url "https://www.easyjet.com/en/"
#        Hover is not possible. so use CLICK
#        And I hover over "Holidays"
        Then I should see text "Why book with us?","Top Beach destinations", "Top City Breaks destinations"


    Scenario Outline: Top City Breaks destinations - Amsterdam
#        Given I enter url "https://www.easyjet.com/en/"
#        Hover is not possible. so use Click.
#        And I hover over "Holidays"
        When I click on "<city>"
        Then I should see header "<main header>"
        And I should see buttons "<tophotels>", "<thingstodo>"
        And I should see top 3 hotels as "<hotel1>", "<hotel2>", "<hotel3>" in header "<hotels header>"
        And I should see text "<text>"

        Examples:
            | city      | main header           | tophotels  | thingstodo                | hotels header       | hotel1                 | hotel2        | hotel3             | text                      |
            | Amsterdam | Holidays in Amsterdam | TOP HOTELS | THINGS TO DO IN AMSTERDAM | Hotels in Amsterdam | WestCord Fashion Hotel | Ramada Apollo | Die Port Van Cleve | Things to Do in Amsterdam |

    Scenario Outline: Hotels in Amsterdam
#        Given I enter url "https://www.easyjet.com/en/"
#        And I hover over "Holidays"
        When I click on "<city>"
        And I click on button "TOP HOTELS"
        Then I should see view this holiday button for top 3 hotels "viewbutton1", "viewbutton2", "viewbutton3"
        And I should see price greater than "0" for top 3 hotels "price1", "price2", "price3"

        Examples:
            | city      |
            | Amsterdam |

    Scenario Outline: Booking a holiday - Amsterdam
#        Given I enter url "https://www.easyjet.com/en/"
#        And I hover over "Holidays"
        When I click on "<city>"
        And I click on button "TOP HOTELS"
        And I click on "view this holiday" in "<hotel1>"
        And I enter flying from "<departure city>"
        And I click on "search again"
        And I click on "change dates and duration"
        And I change duration of stay to "<duration>"
        And I select a "<start date>"
        And I click "OK"
        And I click on "continue"
        And I click on "continue" again
        Then I should see "Payment Details" page
        Examples:
            | city      | hotel1                 | departure city     | duration | start date |
            | Amsterdam | WestCord Fashion Hotel | London Gatwick LGW | 4        | 2017-08-02 |

    Scenario Outline:Payment Details
#        Given I enter url "https://www.easyjet.com/en/"
#        And I hover over "Holidays"
        When I click on "<city>"
        And I click on button "TOP HOTELS"
        And I click on "view this holiday" in "<hotel1>"
        And I enter flying from "<departure city>"
        And I click on "search again"
        And I click on "change dates and duration"
        And I change duration of stay to "<duration>"
        And I select a "<start date>"
        And I click "OK"
        When I click on "continue"
        And I click on "continue" again
        And I select title1 "<title1>" in the payments page
        And I enter first name1 "<Firstname1>"
        And I enter Surname1 "<Surname1>"
        And I enter title2 "<title2>"
        And I enter first name2 "<Firstname2>"
        And I enter Surname2 "<Surname2>"
        And I enter email address "<emailID>"
        And I enter confirm email address "<confirmemailID>"
        And I enter mobile phone number "<mobno>"
        And I enter telephone no "<telno>"
        When I click "Pay Now" button
        Then I should see "<error message>"
        Examples:
            | city | hotel1 | departure city | duration | start date | title1 | Firstname1 | Surname1 | title2 | Firstname2 | Surname2 | emailID | confirmemailID | mobno | telno | error message |