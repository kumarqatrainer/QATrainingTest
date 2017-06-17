@regression
Feature: New user form

#    @smoke @sanity
#    Scenario: New user should be able to register to Easyjet website
#        Given I enter url "https://www.easyjet.com"
#        And I enter email address is "testqa13@hotmail.com"
#        And I enter email address is "testqa13@hotmail.com"
#        And I enter confirm email address is "testqa13@hotmail.com"
#        And I enter password "Password123"
#        And I enter confirm password "Password123"
#        And I enter Title as "Mr"
#        And I enter First name as "testqa"
#        And I enter Surname as "qa123"
#        And I enter Address "no: 123"
#        And I enter town or city as "Kent"
#        And I enter postcode "RG427WS"
#        And I select Country "United Kingdom"
#        And I enter Mobile telephone number "07955567889"
#        And I clicked terms and conditions checkbox
#        When I click Register Now button
#        Then I should see "My account details" text
#        And I should see name as "Mr testqa qa123"
#        And I should see Edit button
#        And I should see Sing Out button

#    Scenario Outline: New user should be able to register to Easyjet website with outline
#        Given I enter url "<url>"
#        And I enter email address is "<emailAddress>"
#        And I enter confirm email address is "<confirmEmailId>"
#        And I enter password "<password>"
#        And I enter confirm password "<confirmPassword>"
#        And I enter Title as "<Title>"
#        And I enter First name as "<firstName>"
#        And I enter Surname as "<surName>"
#        And I enter Address "<address>"
#        And I enter town or city as "<city>"
#        And I enter postcode "<postCode>"
#        And I select Country "<country>"
#        And I enter Mobile telephone number "<mobileTelephoneNumber>"
#        And I clicked terms and conditions checkbox
##        When I click "Register Now" button
##        Then I should see email address "<expectedEmailAddress>" on the page
#        Examples:
#            | url                                 | emailAddress       | confirmEmailId     | password    | confirmPassword | Title  | firstName  | surName | address | city | postCode | country         | mobileTelephoneNumber | expectedEmailAddress |
#            | https://www.easyjet.com/en/register | testqa@hotmail.com | testqa@hotmail.com | Password123 | Password123     | Mr     | testqa     | session | hurri   | Kent | RG458RS  | United Kingdome | 079555877643          | testqa@hotmail.com   |
#            | https://www.easyjet.com/en/register | vasu@hotmail.com   | vasu@hotmail.com   | Password123 | Password123     | sruthi | vasundhara | session | hurri   | Kent | RG458RS  | United Kingdome | 079555877643          | testqa@hotmail.com   |
#
#        @prem
#    Scenario Outline: Invalid scenarios
#        Given I enter url "https://www.easyjet.com/en/register"
#        And I enter email address is "<emailAddress>"
#        And I enter confirm email address is "<confirmEmailId>"
#        And I enter password "<password>"
#        And I enter confirm password "<confirmPassword>"
#        When I click Register Now button
#        Then I should see "<ErrorMessage>"
#
#        Examples:
#            | emailAddress | confirmEmailId | password | confirmPassword | ErrorMessage                                                                                                                                                             |
##            | testqa           | tetsqa            | Password123 | Password123     | Please enter a valid email address       |
##            | tony@hotmail.com | tonyU@hotmail.com | Password123 | Password123     | The email addresses entered do not match |
##            | tony@hotmail.com | tony@hotmail.com  |             |                 | Your password must be a single word between 6 and 20 characters in length and must not include the special characters # & + or space.                                    |
##            | tony@hotmail.com | tony@hotmail.com  | Password123 | Password        | The passwords entered do not match                                                                                                                                       |
#            |              |                |          |                 | Please enter a valid email address,Your password must be a single word between 6 and 20 characters in length and must not include the special characters # & + or space. |


#    @account-details
#    Scenario: Invalid Scenarios for Account details
#        Given I enter url "https://www.easyjet.com/en/register"
#        And I enter below account details
#            | title | Firstname     | Surname     | Address |
#            | Mr    | TestFirstName | TestSurname | Kent    |
#        When I click Register Now button
#        Then I should see below errormessage
#            | ErrorMessage                          |
#            | Please enter the contact's first name |


    @k
    Scenario Outline: add some meaningful scenario name here.
        Given I enter url "https://www.easyjet.com/en/help/baggage/cabin-bag-and-hold-luggage"
#        And I entered source "<Source>"
#        And I entered destination "<Destinaton>"
#        And I entered Departing date "<DepartingDate>"
#        And I entered Returning date "<ReturningDate>"
#        When I click Search button
#        Then I should see text “Add your return flight”
#        And I should see text “Show FLEXI fares”
#        And I should see link “Change search”
#        And I should see link “1 recent searches”
        Examples:
            | Source | Destinaton | DepartingDate | ReturningDate |
            | paris  |            | 2017-06-18    |               |