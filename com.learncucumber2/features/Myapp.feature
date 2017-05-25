Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credential
    Given Open chrome and star application
    When I enter "<username>"
    And Pongo enter a valid "<password>"
    Then User should be able to login succesfully
    Then application should be closed

    Examples: 
      | username               | password      |
      | 92.ivan.9221@gmail.com | SogetiEsp1234 |
      | 92.ivan.9221@gmail.com | SogetiEsp1234 |
      | 92.ivan.9221@gmail.com | SogetiEsp1234 |

