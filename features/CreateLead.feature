Feature: CreateLead Functionality for Leaftaps Application

Background: Positive Login
Given Enter the username as <username>
And   Enter the password as <password>
And  Click the Login
And Home page is displayed
And Click Crm Link
And Click Leads button
When Click Create Leads Link

Scenario Outline: Create Lead with Multiple Data
Given Enter the Companyname as <companyname>
And Enter the Firstname as <firstname>
And Enter the Lastname as <lastname>
When Click Create Lead Button
Then View Lead Page is displayed

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|
|companyname|firstname|lastname|
|TestLeaf|Vinothini|B|
