@BookHotel
Feature: Verify the User is on the Book Hotel Page

  Scenario Outline: Verify user is on the Book Hotel Page
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User should verify the message after select hotel "Book A Hotel"
    And User should select all fields in book hotel page "<First Name>","<Last Name>","<Billing Address>"and save generated Order Id
      | Credit Card Type | Credit Card No   | Select Month | Select Year | CVV Number |
      | American Express | 1231542632586245 | December     |        2022 |        643 |
      | VISA             | 1231542632586245 | December     |        2022 |        643 |
      | Master Card      | 1231542632586245 | December     |        2022 |        643 |
      | Other            | 1231542632586245 | December     |        2022 |        643 |
    Then User should verify the message after clicking Book hotel "Booking Confirmation"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         | Loga       | Priya     | Chennai         |

  Scenario Outline: Verify without entering any fields in Book A Hotel Page
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User should verify the message after select hotel "Book A Hotel"
    And User need to click Book Now button without selecting any fields
    Then User should verify the error message after clicking book now "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         |
