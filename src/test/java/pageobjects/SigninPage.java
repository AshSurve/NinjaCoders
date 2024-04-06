package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hooks.DriverManager;
import utilities.LoggerLoad;

public class SigninPage {
	HomePage home = new HomePage();
	public static WebDriver driver=DriverManager.getdriver();
	@FindBy(name="username")public WebElement userName;
	@FindBy(name="password")public WebElement passWord;
	@FindBy(xpath="//input[@value='Login']")public WebElement login;
	
	public SigninPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void Enterlogininfo(String username,String password)
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		login.click();
		
		
	}
	public void errormsg()
	{
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		LoggerLoad.info("Actual message appeared on screen: " + messageStr);
		Assert.assertEquals(messageStr, "Please fill out this field.");
	}
	
}
