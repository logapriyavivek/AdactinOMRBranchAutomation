@SelectHotel
Feature: Verify the User is on the Select Hotel Page

  Scenario Outline: Verify user in Select Hotel Page
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User should verify the message after select hotel "Book A Hotel"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verify without entering any field and click search in Select Hotel
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    And User need to click Continue button without select any hotel
    Then User should verify error message in select hotel "Please Select a Hotel"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         |
