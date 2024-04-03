package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import junit.framework.Assert;
import utilities.LoggerLoad;


public class HomePage extends DriverManager{

	public static WebDriver driver=DriverManager.getdriver();

	String URL = "https://dsportalapp.herokuapp.com/";
	@FindBy(xpath="//button[text()='Get Started']")public WebElement getStarted;
	String homeUrl="https://dsportalapp.herokuapp.com/home";
	@FindBy(xpath="//a[text()='Get Started']")public WebElement getStartedhome;
	@FindBy(xpath="//div[contains(text(),'not logged')]")public WebElement alert;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")public WebElement dropDown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")public List<WebElement> dropDownlinks;
	@FindBy(xpath="//a[text()='Sign in']")public WebElement signIn;
	@FindBy(xpath="//a[text()=' Register ']")public WebElement Register;
	
	String LoginUrl="https://dsportalapp.herokuapp.com/login";
	String RegisterUrl="https://dsportalapp.herokuapp.com/register";
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {

		driver.get(URL);

	}
	public void dsalgohomepage() {
		driver.get(homeUrl);
	}
	public void getStarted() {
		getStarted.click();
	}
	public void getStartedhome(String string) {
		LoggerLoad.info("\n-- click getStarted "+string);
		getStartedhome.click();
	}
	public void warningMsg(String msg) {
		
		String Alert=alert.getText();
		Assert.assertEquals(msg, Alert);

			LoggerLoad.error("\n-- message -->\n"+Alert);
			dsalgohomepage();

	}

	public void DSdropDown(String string) {

		dropDown.click();

		List<WebElement> DS =dropDownlinks;

		for(WebElement ele:DS)
		{
			if(ele.getText().equalsIgnoreCase(string))
			{	
				LoggerLoad.info("\n-- click for "+string);
				ele.click();
				
				break;
			}
		}
	}
	
	public void SignIn() {
		signIn.click();
	}
	public void Login() {
		driver.navigate().to(LoginUrl);
		//driver.get(LoginUrl);
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
