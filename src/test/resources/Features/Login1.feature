Feature: This is to test login functionality


  Scenario: Check login is successfull with valida credentials
  
    Given User is on login page
    When User enters username and password
    And click on submit1
    Then user should login successfully and naviage to home page

