package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange_SD {
	
static int vijaya;
	
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//button[text()=' Login ']");
	
	static WebDriver driver;
	
	@Given("user is login to Orange HRM application")
	public void user_is_login_to_orange_hrm_application() {
		
		String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.manage().window().maximize();
		   driver.get(URL);
		   driver.findElement(username).sendKeys("Admin");
		   driver.findElement(password).sendKeys("admin123");
		   driver.findElement(login).click();
		   
		   vijaya=100;
	   
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user navigates to Leave meanu in Orange HRM application")
	public void user_navigates_to_leave_meanu_in_orange_hrm_application() {
	    
	   // throw new io.cucumber.java.PendingException();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");
	}

	@When("user clicks apply link in leave screen of Orange HRM application")
	public void user_clicks_apply_link_in_leave_screen_of_orange_hrm_application() {
	   
	   
	}

	@Then("user should able to view Apply Leave screen in Orange HRM application")
	public void user_should_able_to_view_apply_leave_screen_in_orange_hrm_application() {
	   
	    
	}

	@When("user selects personal leave in leave screen of Orange HRM application")
	public void user_selects_personal_leave_in_leave_screen_of_orange_hrm_application() {
	   
	    
	}

	@Then("user is able to view leave balance in leave screen of Orange HRM application")
	public void user_is_able_to_view_leave_balance_in_leave_screen_of_orange_hrm_application() {
	    
	    
	}

	@When("user selects from and to dates in leave screen of Orange HRM application")
	public void user_selects_from_and_to_dates_in_leave_screen_of_orange_hrm_application() {
	    
	    
	}

	@When("user enters comments in leave screen of Orange HRM application")
	public void user_enters_comments_in_leave_screen_of_orange_hrm_application() {
	    
	    
	}

	@When("user clicks Apply button in leave screen of Orange HRM application")
	public void user_clicks_apply_button_in_leave_screen_of_orange_hrm_application() {
	   
	    
	}

	@Then("user is able to view success message in leave screen of Orange HRM application")
	public void user_is_able_to_view_success_message_in_leave_screen_of_orange_hrm_application() {
	   
	    
	}


}
