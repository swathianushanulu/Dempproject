@LeadCreation
Feature: Testing of Leads Creations



 Background:
    Given User login into D365 page
    When user enters valid username "userid"
    And Click on Next button
    When user enter valid password "pwd"
    And click on signin
    And Click on yes
    When user selects App "Sales Hub"


@ValidateEntities
Scenario: Validating entities in the customer sitemap
      When user click on "Leads" under customer
      #Then user validates "Leads" under customer
      Then user validates "My Open Leads" heading view
      
     When user click on "Activities" under customer
      #Then user validates "Activities" under customer
      Then user validates "My Activities" heading view
      When user click on "Quotes" under customer
      #Then user validates "Quotes" under customer
      Then user validates "My Quotes" heading view
      When user click on "Opportunities" under customer
      #Then user validates "Opportunities" under customer
      Then user validates "My Open Opportunities" heading view
      When user click on "Orders" under customer
      #Then user validates "Orderss" under customer
      Then user validates "My Orders" heading view
      When user click on "Contacts" under customer
      #Then user validates "Leads" under customer
      Then user validates "My Active Contacts" heading view
 @AddLead
  Scenario: Add new record under Leads and validate the Opportunity and Customer record
    When user click on "Leads" under customer
    Then user click on "New"
    And user fill "Topic" field as "topic5"
    Then user fill "Last Name" field As "l5"
    And user click Save
    When user click on "Leads" under customer
    Then user validates "l5" is showing in the "Leads" list
    And user click on "l5" lead
    Then user click Qualify Bpf stage
    And user check the Identify Decision maker field 
    Then user click Qualify
    When user click on "Opportunities" under customer
    Then user validates "topic5" is showing in the "Opportunity" list
 
    #When user click on "Contacts" under customer
   #Then user validates "QA Leader 4" is showing in the "Contacts" list
  
 