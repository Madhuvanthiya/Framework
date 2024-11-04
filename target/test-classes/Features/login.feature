Feature: Test Adactin page

  Scenario: Test Automation of Adactin Hotel for Booking
    Given User should enter the UserName as "MadhuArun"
    And User should enter the Password as "L9J6CK"
    When User click on the Login button
    Then Login should pass
    When user should Select the Location
    And User Select the Hotel,Room type
    And User Select the Number of Rooms
    And User should Enter the Check In Date
    And User should Enter the Check Out Date
    And User Should Select the Adults per Room
    And User Should Select the Children per Room
    When User Click the Search button
    Then Navigate to Select Hotel Page
    When User Click on the Radio button
    And User should Click Continue button
    Then Navigate to Book A Hotel page
    When User Enter the FirstName, LastName, Billing Address,Credit card No.
    And User should Select the Credit card type,Expire Date
    And User should enter the CVV Number
    Then Click BookNow button
    And User navigate to Booking Confirmation page
    And Get the Orderno for booking conformation
    Then User Click MyItinerary button
    And User Navigate to Select Hotel page
    When User select the Ordered checkbox
    Then Click on the CancleSelect button
    And User Click on Logout button to exit the Test
  #Scenario Outline: Login should pass
  #Given User launch the browser using url
  #And User enter the Username as "<Username>"
  #And User enter the Password as "<Password>"
  #When User click the Login button
  #Then User login should pass navigate to Search hotel page
  #
  #Examples:
  #|Username|Password|
  #|MadhuArun|Madhuarun88@|
  #|Madhuvanthiya|Madhuarun88@|
  #Background: 
    #Given User launch the browser using url
    #When User click the Login button
#@pass
  #Scenario: Login should pass
      #Given User launch the browser using url
    #And User enter the Username as "MadhuArun"
    #And User enter the Password as "Madhuarun88@"
    #When User click the Login button
    #Then User login should pass navigate to Search hotel page
#@fail
  #Scenario: Login should be invalid
    #Given User launch the browser using url
    #And User enter the Username as "MadhuvanthiyaArun"
    #And User enter the Password as "Madhuarun88@"
    #When User click the Login button
    #But User login should fail get Exception as Invalid Login details
