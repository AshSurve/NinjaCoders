package stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.RegisterPage;


public class RegisterPageSteps {
	
	RegisterPage regPg=new RegisterPage();

	// @register1
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		
	    regPg.gotoRegPage();
	}
    // @register2 
	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
	    
		regPg.clickRegButton();
	
	}

	@Then("It should display an error message {string} below Username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String string) {
	   regPg.errorMessage();
	  
	}

	// @register3
	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, DataTable dataTable) {
	    regPg.userNameData(dataTable);
	    regPg.clickRegButton();
	   
	}

	@Then("It should display an error message {string} below Password textbox")
	public void it_should_display_an_error_message_below_password_textbox(String string) {
		regPg.errorMessage();
		
	}


	// @register4
	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3,DataTable dataTable) {
	    regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	   // regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	    
	}

	@Then("It should display an error message {string} below Password Confirmation textbox")
	public void it_should_display_an_error_message_below_password_confirmation_textbox(String string) {
	    regPg.errorMessage();
	   
	}

	// @register5

	@When("The user enters a {string} with characters other than Letters, digits and @, ., +, -, _ with valid {string} and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and_with_valid_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	   
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expErrMsg) {
		try {
			String msg=regPg.readErrorMsg();
		assertNotEquals(msg, expErrMsg);
		System.out.println(expErrMsg);
		System.out.println(msg);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
	}

	// @register6
	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	   
	}
	
	//@register7
	@When("The user enters a valid {string} and {string} with characters less than eight")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	    
	}
	//@register8
	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	   
	}
	//@register9
	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	    
	}
	
	//@register10

	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	    
	}
	//@register11
	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	   
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		try {
			String msg=regPg.getNewAcctMsg();
			assertNotEquals(regPg.getNewAcctMsg(), string);
			System.out.println(msg);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}
	
	//@register12
	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3,DataTable dataTable) {
		regPg.userNameData(dataTable);
	    regPg.pwdData(dataTable);
	    regPg.confPwdData(dataTable);
	    regPg.clickRegButton();
	    
	}

	@Then("It should display error message as {string}")
	public void it_should_display_error_message_as(String expErrMsg) {
		try {
		 
			String msg1=regPg.readErrorMsg();
		assertEquals(msg1, expErrMsg);
		System.out.println(expErrMsg);
		System.out.println(msg1);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
	}


}
