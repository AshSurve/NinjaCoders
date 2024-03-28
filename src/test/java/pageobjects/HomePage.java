package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;

public class HomePage extends DriverManager{
	
	public static WebDriver driver=DriverManager.getdriver();
	String URL = "https://dsportalapp.herokuapp.com/";
	
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {

		driver.get(URL);

	}

}
