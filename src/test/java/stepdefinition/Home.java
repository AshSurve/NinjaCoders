package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobjects.HomePage;
import pageobjects.Reusablepageobjects;

public class Home {

	HomePage home = new HomePage();
	Reusablepageobjects reuse=new Reusablepageobjects();
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	   
		home.dsalgopage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		home.getStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	   reuse.dsalgohomepage();
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		 reuse.dsalgohomepage();
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		
		home.getStartedhome(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		
		home.warningMsg(string);

	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
	   home.DSdropDown(string);
	}
	
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
	    reuse.SignIn();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
	   reuse.Login();
	}

	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
	   reuse.Register();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		reuse.Registerpage();
	}



}
