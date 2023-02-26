Feature: Guru99 New Bank Create new customer

Scenario Outline: login Bank account

Given User is already on login page
When title of login page is Guru99 Bank Home Page
Then user enters "<username>" and "<password>"
Then user clicks on login page
Then user is on Home Page
And user click on Log Out
Then user click on New Tours page
And user click on Register button
Then user enters registration details "<name>" and "<address>" and "<num>" and "<city>" and "<username>" and "<pwd>" and "<cpwd>"

Then close the browser

Examples:
| username | password | name | address | num | city | username | pwd | cpwd |
| mngr480097 | tapasYs | Adhira | Pune | 9876543289 | PUNE | Adhira | Adhira | Adhira|
| mngr4800sdsc97 | tadcdspasYs | Adhidcra | Pundcsde | 987634543289 | PUN56E | Adh78ira | p3wd | c44pwd |