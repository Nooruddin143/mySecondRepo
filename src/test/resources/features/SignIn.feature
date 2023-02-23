Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click in Sign in option
    And User enter email 'nooruddin.mohammadi@gmail.com' and password 'Noorkhan@143'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click in Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                         | password     |
      | nooruddin.mohammadi@gmail.com | Noorkhan@143 |
      | phantom.test@gmail.com        | Tek@12345    |

  
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name      | email                        | password     | confirmPassword |
      | nooruddin | nooruddin.mohammad@gmail.com | Noorkhan@143 | Noorkhan@143    |
    And User click on SignUp button
    Then User should be logged into account page
