Feature: Register with Data Driven with map

#  without example keyword

  Scenario: Register with data driven with Map

    Given User is already on Registration page
#    When user enters firstname and lastname
#      | Firstname | Lastname |
#      | ADHIRA | PATIL |
##      | MONIKA | PATIL |

    Then user enters users details for Registration
      | Firstname | Lastname | User Name  | Password   | Confirm Password |
      | ADHIRA    | PATIL    | ADHIRA2022 | Adhira@123 | Adhira@123       |
      | MONIKA    | PATIL    | MONIKA123 | Monika@123 | Monika@123 |
      | AKSHAY   | PATIL    | AKSHAY23 | Akshay@123 | Akshay@123 |

    Then close the browser