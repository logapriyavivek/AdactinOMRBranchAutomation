@Cancel
Feature: Verify the User is on the Cancel Booking Page

  Scenario Outline: Verify user is on cancel Booking Page
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should Select all fields to search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User should verify the message after select hotel "Book A Hotel"
    And User should select all fields in book hotel page "<First Name>","<Last Name>","<Billing Address>"and save generated Order Id
      | Credit Card No   | Credit Card Type | Select Month | Select Year | CVV Number |
      | 1231542632586245 | American Express | December     |        2022 |        643 |
      | 1231542632586245 | VISA             | December     |        2022 |        643 |
      | 1231542632586245 | Master Card      | December     |        2022 |        643 |
      | 1231542632586245 | Other            | December     |        2022 |        643 |
    Then User should verify the message after clicking Book hotel "Booking Confirmation"
    And User should cancel the Order Id
    Then User should verify Order Id cancelled message after cancelling the booking "The booking has been cancelled."

    Examples: 
      | userName  | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address |
      | logapriya | C0UH62   | London   | Hotel Sunshine | Double   | 1 - One       | 21-06-2022  | 23-06-2022   | 1 - One       | 1 - One         | Loga       | Priya     | Chennai         |

  Scenario Outline: Verify user is on cancel the Existing Order Id
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"
    And User should cancel the Existing Order Id in Book Itinerary page "<Order Id>"
    Then User should verify Order Id cancelled message after cancelling the booking "The booking has been cancelled."

    Examples: 
      | userName  | password | Order Id   |
      | logapriya | C0UH62   | 8LA4Q38K2L |
