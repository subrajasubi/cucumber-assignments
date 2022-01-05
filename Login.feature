Feature: Login functionality of leaftaps application


Scenario Outline:Tc001_Login with positive credential

Given Enter the username as <username>

And Enter the password as <password>

When Click on login button

Then Homepage should be displayed

Examples:

|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|



Scenario: TC002_Login with invalid credential

Given Enter the username as 'democsr'

And Enter the password as 'crmsfa'

When Click on login button

But Error message  should be displayed



