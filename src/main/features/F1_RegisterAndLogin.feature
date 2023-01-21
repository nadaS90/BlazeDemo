@test

Feature: users could register with new account and try to login.

  Scenario: guest user could register with valid data successfully
    Given user navigates to signUp popUp
    And   user enters valid username
    And   user fills valid password
    When  user clicks signUp Button
    Then  user could register successfully and success msg appears
    When  user go to login popUp
    And   user enter valid email and password




