Feature: Steps for merge lead functionality
@Smoke
Scenario: CreateLead with mandatory details
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then Click on Merge Leads Link
When Click on Widjets on From Lead
Then New Window should be opened
When Click the lead Id
Then Go back to the Original Window
When Click on SecondWidjets on To Lead
Then Another New Window should be opened
When Click the Second Lead Id
Then Go back to the  Window
When Click on the Merge Button
Then Accept the Alert
Then Title should be displayed