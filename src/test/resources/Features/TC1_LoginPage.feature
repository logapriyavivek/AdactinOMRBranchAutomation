@Login
Feature: Verify Adactin Login Details

  Scenario Outline: Verifying Adactin Login details with valid credentials
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"

    Examples: 
      | userName  | password |
      | logapriya | C0UH62   |

  Scenario Outline: Verifying hotel login details using Enter key
    Given User is on Adactin Login page
    Then User should login with the help of enter key "<userName>" and "<password>"
    Then User should verify success message after Login "Hello logapriya!"

    Examples: 
      | userName  | password |
      | logapriya | C0UH62   |

  Scenario Outline: Verifying hotel login details with Invalid credentials
    Given User is on Adactin Login page
    When User should login "<userName>" and "<password>"
    Then User should verify Login error message that contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName  | password  |
      | logapriya | Hello@123 |