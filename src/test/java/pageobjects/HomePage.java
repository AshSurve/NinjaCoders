package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import junit.framework.Assert;
import utilities.LoggerLoad;
import pageobjects.Reusablepageobjects;

public class HomePage extends DriverManager{

	public static WebDriver driver=DriverManager.getdriver();
	Reusablepageobjects reuse=new Reusablepageobjects();
	String URL = "https://dsportalapp.herokuapp.com/";
	@FindBy(xpath="//button[text()='Get Started']")public WebElement getStarted;
	@FindBy(xpath="//a[text()='Get Started']")public WebElement getStartedhome;
	@FindBy(xpath="//div[contains(text(),'not logged')]")public WebElement alert;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")public WebElement dropDown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")public List<WebElement> dropDownlinks;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {

		driver.get(URL);

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
			reuse.dsalgohomepage();

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
	
}
