Feature: this is to validation edge login

  Scenario Outline: login with valid user
    Given land on edge login
    When enters the <username> and <password>
    And click on submit
    Then user will lang on hoome page

    Examples:
    | username | password |
    |arun.joseph@learnship.com|Airtel@123|
    |Insightadmin|Insight_0217|