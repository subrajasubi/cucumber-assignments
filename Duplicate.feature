Feature: Steps for Duplicate Lead
@Regression
Scenario: Details for Duplicate Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
When Click on Find Leads link
Then  CLick on Phone Button
And Enter the PhoneNumber as '96'
Then Click on Find Leads Button
When Click on the resulting name 
When Click on Duplicate Button
Then Click on Submit Button