Feature: Steps for Delete Lead

Scenario: Details for Delete Lead
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
And Enter the PhoneNumber as '99'
Then Click on Find Leads Button
When Click on First Resulting Lead Id as '10259'
Then Click on Delete Button
When Click on Find Leads link
Given Enter the Lead Id as '10259'
And Click on Find Leads Button
Then HomePage should be displayed