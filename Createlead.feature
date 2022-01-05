Feature: Create Lead functionality for Leaftaps application


Scenario: CreateLead with mandatory details
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
Given Enter the company name as 'Testleaf'
And Enter the firstname name as 'Subraja'
And Enter the lastname name as 'Subi'
When Click on submit button 
Then  Number should be displayed 
Then My Home Page should be displayed


