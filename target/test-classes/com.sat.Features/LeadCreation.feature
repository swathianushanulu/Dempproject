@LeadCreation
Feature: Testing of Leads Creations



 Background:
    Given User login into L&G CRM page
    When user enters valid username "userid"
    And Click on Next button
    When user enter valid password "pwd"
    And click on signin
    And Click on yes
    When user selects App "Sales Hub"



 @AddLead
  Scenario: Add new record under Leads and validate the Opportunity and Customer record
    When user click on "Leads" under customer
    Then user click on "New"
    And user fill "Topic" field as "Sales force1"
    Then user fill "Last Name" field As "Kavitha1"
    And user click Save
    Then user click Qualify Bpf stage
    And user check the Identify Decision maker field field
    Then user click Qualify
    When user click on "Opportunities" under customer
    Then user validates "Sales force1" is showing in the "Opportunity" list
 
    #When user click on "Contacts" under customer
   #Then user validates "QA Leader 4" is showing in the "Contacts" list
    
  
    