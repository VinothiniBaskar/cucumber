Feature:  Functioanlity of Login Page

Scenario Outline: Positive Functionality of Login Page
Given Enter the username as <username>
And   Enter the password as <password>
And  Click the Login
And Home page is displayed
And Click Crm Link
And Click Leads button
When Click Create Leads Link



Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|