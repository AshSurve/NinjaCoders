package pageobjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import junit.framework.Assert;
import utilities.LoggerLoad;

public class DataStructurePage {

	public static WebDriver driver=DriverManager.getdriver();
	Reusablepageobjects reuse=new Reusablepageobjects();
	@FindBy (xpath="//h5[text()='Data Structures-Introduction']/../a")public WebElement GetStarted;
	String DSUrl="https://dsportalapp.herokuapp.com/data-structures-introduction";
	
	@FindBy(name="username")public WebElement userName;
	@FindBy(name="password")public WebElement passWord;
	@FindBy(xpath="//input[@value='Login']")public WebElement login;
	@FindBy(xpath="//a[text()='Time Complexity']")public WebElement timeC;
	@FindBy(linkText="Practice Questions")public WebElement practiceQue;
	public String TCUrl="https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
	public String PracticeQUrl="https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
	public DataStructurePage() {

		PageFactory.initElements(driver, this);
	}
	public void chklogin() {
		reuse.dsalgohomepage();
		reuse.SignIn();
		reuse.Login();
		userName.sendKeys("ashsurve");
		passWord.sendKeys("Ninjacoders123");
		login.click();	
	
		String title=driver.getTitle();
		LoggerLoad.info("you are on "+title+" page");
		
	}
	
	
	public void Datastructure_page()
	{
		
		driver.navigate().to(DSUrl);
		String title=driver.getTitle();
		LoggerLoad.info("you are on "+title+" page");
	}
	
	public void landTCpage()
	{
		driver.navigate().to(TCUrl);
		String title=driver.getTitle();
		Assert.assertEquals("Time Complexity",title);
		LoggerLoad.info("you are on "+title+" page");
	}
	public void TCP()
	{
		driver.get(TCUrl);
	}
	
	
	
}
