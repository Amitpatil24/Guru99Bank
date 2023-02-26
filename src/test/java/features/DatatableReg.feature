Feature: Register with data table details

#  without example keyword

  Scenario: Register with data table

  Given User is already on Registration page
  When user enters firstname and lastname
    | ADHIRA | PATIL |

  Then user enters username password and confirmPassword
    | ADHIRA2022 | Adhira@123 | Adhira@123 |

  And user click on submit button

  Then close the browser