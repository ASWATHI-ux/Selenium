Feature: Test the KSRTC application

  Scenario Outline: Test the login page
    Given Open chrome browser and url of the application
    When Enter the "<Username>","<password>" and click on login button
    Then Success in login
    Then user is navigate to search page
    When Enter  bording place name,alighting place name,txtJourneyDate,txtReturnJourneyDate and click on search button
    Then Success in search

    Examples: 
      | Username             | password |
      | aswathi433@gmail.com | Abc@123  |

 
