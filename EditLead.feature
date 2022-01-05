Feature: Edit Lead creation

Scenario: Mandatory detials for Edit Lead
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
Then Click on Edit Button
And Update the Company Name as 'TCS'
Then Click on Submit Button