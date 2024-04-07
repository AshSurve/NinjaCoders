package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import hooks.DriverManager;
import junit.framework.Assert;
import utilities.LoggerLoad;

public class Reusablepageobjects {
	
	public static WebDriver driver=DriverManager.getdriver();
	
	String homeUrl="https://dsportalapp.herokuapp.com/home";
	@FindBy(xpath="//a[text()='Sign in']")public WebElement signIn;
	String LoginUrl="https://dsportalapp.herokuapp.com/login";
	@FindBy(xpath="//a[text()='Try here>>>']")public WebElement TryHere;
	String assessmentUrl="https://dsportalapp.herokuapp.com/tryEditor";
	@FindBy(xpath="//a[contains(text(),'Register')]")public WebElement Register;
	String RegisterUrl="https://dsportalapp.herokuapp.com/register";
	@FindBy(xpath="//div[contains(@class,'CodeMirror')]//textarea")public WebElement texteditor;
	@FindBy(xpath="//button[text()='Run']")public WebElement run;
	@FindBy(xpath="//pre[@id='output']")public WebElement consoleOutput;
	//pre[@id="output"]
	//div[@class="input"]
	
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
	public void Editor()
	{
		driver.navigate().to(assessmentUrl);
	}
	public void Editorlink()
	{
		driver.get(assessmentUrl);
	}
	public void sendcmd() {
		
	}
	public void alert()
	{
		//Alert alert=Wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		LoggerLoad.info("user gets an alert"+alert.getText()+" for given input");
		alert.accept();
	}
	
}
