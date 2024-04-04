
@register
Feature: Validating Register page

  @register1
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage

  @register2
  Scenario: The user gets error message for empty fields into Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox

  @register3
  Scenario: The user gets error message for empty fields into Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering username with other fields empty
      | username  |
      | ashsurve |
    Then It should display an error message "Please fill out this field." below Password textbox

  @register4
  Scenario: The user gets error message for empty fields into confirm Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username       | password     | 
      | ashsurve | ninjacoders123 | 
    Then It should display an error message "Please fill out this field." below Password Confirmation textbox

  @register5
  Scenario: The user gets error message for invalid username
    Given The user opens Register Page
    When The user enters a "username" with characters other than Letters, digits and @, ., +, -, _ with valid "password" and "confirm password"
      | username | password     | confirm password |
      | $$$**&&&  |  ninjacoders123 |  ninjacoders123 |
    Then It should display an error message "Please enter a valid username"

  @register6
  Scenario: The user gets error message for password mismatch
    Given The user opens Register Page
    When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username       | password     | confirm password |
      | ashsurve@gmail.com | qwertyuiop | qwertyuiop |
    Then It should display an error message "password_mismatch: The two password fields didn’t match."

  @register7
  Scenario: The user gets error message for password with characters less than eight
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with characters less than eight
      | username       | password | confirm password |
      | ashsurve@gmail.com | qwert  | qwert |
    Then It should display an error message "Password should contain at least 8 characters"

  @register8
  Scenario: The user gets error message for password with only numbers
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with only numbers
      | username       | password | confirm password |
      | ashsurve@gmail.com | 98765432 | 98765432 |
    Then It should display an error message "Password can’t be entirely numeric."

  @register9
  Scenario: The user gets error message for password too similar to your other personal information
    Given The user opens Register Page
    When The user enters a valid "username" and "password" similar to username
      | username       | password   | confirm password |
      | ashsurve@gmail.com | ninjacoders | ninjacoders |
    Then It should display an error message "password can’t be too similar to your other personal information."

  @register10
  Scenario: The user gets error message for commonly used password
    Given The user opens Register Page
    When The user enters a valid "username" and commonly used password "password"
      | username       | password | confirm password |
      | ashsurve@gmail.com | Hello3456 | Hello3456 |
    Then It should display an error message "Password can’t be commonly used password"

  @register11
  Scenario: The user redirected to Homepage with valid details
    Given The user opens Register Page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username       | password  | confirm password |
      | ashsurve@gmail.com | qwertyuiop | qwertyuiop |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"

  @register12
  Scenario: The user gets error message for existing username
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "password confirmation"
      | username       | password  | confirm password |
      | ashsurve@gmail.com | qwertyuiop | qwertyuiop |
    Then It should display error message as "Username already exists"

  
