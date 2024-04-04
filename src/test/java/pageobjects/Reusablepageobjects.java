package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import junit.framework.Assert;
import utilities.LoggerLoad;

public class Reusablepageobjects {
	
	public static WebDriver driver=DriverManager.getdriver();
	
	String homeUrl="https://dsportalapp.herokuapp.com/home";
	@FindBy(xpath="//a[text()='Sign in']")public WebElement signIn;
	String LoginUrl="https://dsportalapp.herokuapp.com/login";
	@FindBy(xpath="//a[contains(text(),'Register')]")public WebElement Register;
	String RegisterUrl="https://dsportalapp.herokuapp.com/register";
	public Reusablepageobjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dsalgohomepage() {
		driver.get(homeUrl);
	}
	public void SignIn() {
		signIn.click();
	}
	public void Login() {
		driver.navigate().to(LoginUrl);
	}
	
	public void Register() {
		Register.click();
	}
	public void Registerpage() {
		driver.navigate().to(RegisterUrl);
		String title=driver.getTitle();
		LoggerLoad.info("you are on "+title+" page");
		Assert.assertEquals(title,"Registration");
	}
}
