Feature: Guru99 Home Bank

#  without example keyword

#  Scenario: login Bank account
#
#  Given User is already on login page
#  When title of login page is Guru99 Bank Home Page
#  Then user enters "mngr480097" and "tapasYs"
#  Then user clicks on login page
#  Then user is on Home Page
#  Then close the browser

  Scenario: login Bank account

    Given User is already on login page
    When title of login page is Guru99 Bank Home Page
    Then user enters username and password
    Then user clicks on login page
    Then user is on Home Page
    Then close the browser


#  with example keyword

#  Scenario Outline: login Bank account
#
#    Given User is already on login page
#    When title of login page is Guru99 Bank Home Page
#    Then user enters "<username>" and "<password>"
#    Then user clicks on login page
#    Then user is on Home Page
#    Then close the browser
#
#    Examples:
#      | username | password |
#      | mngr480097 | tapasYs |
#      | amit       | adhira123 |







