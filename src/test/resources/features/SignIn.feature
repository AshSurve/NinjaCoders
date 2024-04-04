 @Signin
		Feature: Sign in to application
		Verifying login feature by providing different inputs 
 		@homepage
    Scenario: User is on Home page and click on sign in
    Given The user is on Home page
    When The user clicks on signin link
    Then The user redirected to login page
  	
  	@Signin2
 	  Scenario Outline: login or sign in
    Given user is on login page
    When user enters username as"<username>" and password as"<password>" in step and user click on login button
    Then user verify the "<Expectedmessage>" in step

    Examples: 
      | username 			  | password 						| Expectedmessage                 |
      | huihgfyuwg6t676 | 76876786						| Invalid Username and Password		|
      |  								|          						| Please fill out this field.	    |
			| invalidusername | valid password		 	| Invalid Username and Password		|
			| valid username 	| invalid password 		| Invalid Username and Password   |
			|									|	random							| Please fill out this field.			|
			|	random					|											|	Please fill out this field.     |
			| ashsurve 	      | Ninjacoders123			| You are logged in               |
		@Signin3
    Scenario: Sign in
    Given user is on login page  
    When User clicks on Register  
    Then User redirected to Registration page