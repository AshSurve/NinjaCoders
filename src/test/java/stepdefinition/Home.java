package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobjects.HomePage;

public class Home {

	HomePage home = new HomePage();
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		home.dsalgopage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		home.getStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	   home.dsalgohomepage();
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		 home.dsalgohomepage();
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		
		home.getStartedhome();
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		
		home.warningMsg();
		
	
	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
	   home.DSdropDown(string);
	}
	
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
	    home.SignIn();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
	   home.Login();
	}

	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
	   home.Register();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		home.Registerpage();
	}



}
