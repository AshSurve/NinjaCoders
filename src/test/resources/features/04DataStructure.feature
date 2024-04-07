
@DataStructure
Feature: validating DataStructure page
  
  @DSIntroduction1
  Scenario: User is on home page and clicks on Data Structures-Introduction Get Started
    Given The user is on Home page and logged in to application  
    When User clicks on Get Started link of ds
    Then User land on Data Structures-Introduction page
   	Then User clicks on Time Complexity link
   	Then User land on Time Complexity page

  @DSIntroduction2
  Scenario: User is on Time Complexity page and clicks on Time Complexity link
    Given User is on Time Complexity page
    When User clicks on time complexity link on TCpage
    Then page get refreshed
  
   @DSIntroduction3
    Scenario: User is on Time Complexity page and clicking Try here 
    Given User is on Time Complexity page
    When User clicks on Try here>>> link
    Then user land on Assessment page where user write python code
   
   @DSIntroduction4
    Scenario: User is on Assessment page and in python editor and clicks on Run 
    Given User is on Assessment page and in python editor
    When User clicks on run button without entering code
    Then  nothing happened user is on same page 
    
    @DSIntroduction5
    Scenario: User is on Assessment page and in python editor and put invalid code and clicks on Run 
    Given User is on Assessment page and in python editor
    When User entering invalid code clicks on Run button
    Then User gets an alert bad input 
    
    @DSIntroduction6
    Scenario: User is on Assessment page and in python editor and put valid code and clicks on Run 
    Given User is on Assessment page and in python editor
    When User entering valid code clicks on Run button
    Then User gets output in console
    
   
  @DSIntroduction7
  Scenario: User is on Time Complexity page and clicks on Practice Questions link
    Given User is on Time Complexity page
    When User clicks on Practice Questions
    Then User redirected to  Practice Questions page where page is blank 
    

   