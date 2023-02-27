@CompleteTest
Feature: Retail Application Account Feature
  
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nooruddin.mohammadi@gmail.com' and password 'Noorkhan@143'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Noor' and phone '1234567891'
    And User click on Update button
    Then User profile information should be updated

 @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add Address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add your Address button
    Then a message should be displayed 'Address Added Successfully'
