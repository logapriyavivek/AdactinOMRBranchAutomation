@SearchHotel
Feature: Verify the User is on the Search Hotel Page

  Scenario Outline: Verifying Adactin Login details with valid credentials
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verify whether all Mandatory fields are selected
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select the mandatory fields to search hotel "<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"

    Examples: 
      | userName  | password | Location | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom |
      | logapriya | C0UH62   | London   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       |

  Scenario Outline: Verify Check In Date and Check Out Date
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    Then User should verify error message after search in both date field "Check-In Date shall be before than Check-Out Date" , "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2023  | 23-06-2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verify without entering any field and click search
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User need to click search button
    Then User should verify error message after search hotel "Please Select a Location"

    Examples: 
      | userName  | password |
      | logapriya | C0UH62   |
