package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DataStructurePage;
import pageobjects.Reusablepageobjects;
import utilities.LoggerLoad;

public class DataStructureSteps {

	DataStructurePage dsp=new DataStructurePage();
	Reusablepageobjects reuse=new Reusablepageobjects();
	@Given("The user is on Home page and logged in to application")
	public void the_user_is_on_home_page_and_logged_in_to_application() {
		
		dsp.chklogin();
	}
	
	@When("User clicks on Get Started link of ds")
	public void user_clicks_on_get_started_link_of_ds() {
		dsp.GetStarted.click();
	}

	@Then("User land on Data Structures-Introduction page")
	public void user_land_on_Data_Structures_introduction_page() {
	    dsp.Datastructure_page();
	}

	@Then("User clicks on Time Complexity link")
	public void user_clicks_on_Time_Complexity_link() {
	   dsp.timeC.click();
	}

	@Then("User land on Time Complexity page")
	public void user_land_on_time_complexity_page() {
	   dsp.landTCpage();
	}

	@Given("User is on Time Complexity page")
	public void user_is_on_time_complexity_page() {
		dsp.TCP();
	}
	
	@When("User clicks on time complexity link on TCpage")
	public void user_clicks_on_time_complexity_link_on_TCpage() {
	    dsp.timeC.click();
	}

	@Then("page get refreshed")
	public void page_get_refreshed() {
		dsp.driver.navigate().refresh();
	
		LoggerLoad.info("you are on TimeComplexity page no new window open");
	}

	@When("User clicks on Try here>>> link")
	public void user_clicks_on_try_here_link() {
	    reuse.TryHere.click();
	}

	@Then("user land on Assessment page where user write python code")
	public void user_land_on_assessment_page_where_user_write_python_code() {
		reuse.Editor();
	}

	@Given("User is on Assessment page and in python editor")
	public void user_is_on_assessment_page_and_in_python_editor() {
		reuse.Editorlink();
		
		//JavascriptExecutor js = (JavascriptExecutor) dsp.driver;
		//js.executeScript("arguments[0].value='print \"hello\"'", reuse.texteditor);
		LoggerLoad.info("you are on Assessment page ");
		
	}

	@When("User clicks on run button without entering code")
	public void user_clicks_on_run_button_without_entering_code() {
		reuse.texteditor.sendKeys(" ");
		reuse.run.click();
	}

	@Then("nothing happened user is on same page")
	public void nothing_happened_user_is_on_same_page() {
	   String out=reuse.consoleOutput.getText();
	    
	   LoggerLoad.info("this is output for empty cmd"+out);
	}

	@When("User entering invalid code clicks on Run button")
	public void user_entering_invalid_code_clicks_on_run_button() {
		
		reuse.texteditor.sendKeys(" print\"hello\" ");
		
		LoggerLoad.info("user input: \n "+reuse.texteditor.getAttribute("value"));
		reuse.run.click();
	}

	@Then("User gets an alert bad input")
	public void user_gets_an_alert_bad_input() {
		reuse.alert();
	}

	@When("User entering valid code clicks on Run button")
	public void user_entering_valid_code_clicks_on_run_button() {
		reuse.texteditor.sendKeys("print\"hello\"");
		LoggerLoad.info("user input: \n "+reuse.texteditor.getAttribute("value"));
		reuse.run.click();
	}

	@Then("User gets output in console")
	public void user_gets_output_in_console() {
		String out=reuse.consoleOutput.getText();
		LoggerLoad.info("this is output for valid cmd"+out);
	}

	@When("User clicks on Practice Questions")
	public void user_clicks_on_practice_questions() {
	    dsp.practiceQue.click();
	}

	@Then("User redirected to  Practice Questions page where page is blank")
	public void user_redirected_to_practice_questions_page_where_page_is_blank() {
	    dsp.driver.navigate().to(dsp.PracticeQUrl);
		dsp.driver.getPageSource();

	}

	
	
}
