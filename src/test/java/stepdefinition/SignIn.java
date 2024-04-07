package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjects.Reusablepageobjects;
import pageobjects.SigninPage;
import utilities.LoggerLoad;

public class SignIn {
	public static WebDriver driver=DriverManager.getdriver();


	Reusablepageobjects reuse=new Reusablepageobjects();
	SigninPage login=new SigninPage();
	@FindBy(xpath="//div[@role='alert']")public WebElement alert;
	@FindBy(xpath="//a[text()='Sign out']")public WebElement signout;

	
	public SignIn(){
		PageFactory.initElements(driver, this);
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

		reuse.Login();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Login");
		LoggerLoad.info("User is on Login Page");
	}
	@When("user enters username as{string} and password as{string} in step and user click on login button")
	public void user_enters_and_in_step_and_user_click_on_login_button(String string, String string2) {
		login.Enterlogininfo(string,string2);

	}
	@Then("user verify the {string} in step")
	public void user_verify_the_in_step(String string) {

		String expectedAlertMessage=string;
		if(expectedAlertMessage.equalsIgnoreCase("Please fill out this field."))
		{
			login.errormsg();
			
		}
		else
		{

			String actualAlertMessage=alert.getText();


			if(actualAlertMessage.equals(expectedAlertMessage))
			{
				LoggerLoad.info("Test pass...");
				
			}
			else
			{
				LoggerLoad.info("Test fail");
			}
		}
	}

	@When("User clicks on Register")
	public void user_clicks_on_register() {
		reuse.Register.click();
	}
	@Then("User redirected to Registration page")
	public void user_redirected_to_registration_page() {
		reuse.Registerpage();
	}
	
	
	@Given("user is on Registration page")
	public void user_is_on_registration_page() {
		reuse.Registerpage();
	}
	@When("User clicks on singout")
	public void user_clicks_on_singout() {
		signout.click();
	
	}
	@Then("User redirected to Home page")
	public void user_redirected_to_home_page() {
		reuse.dsalgohomepage();
	}
}
