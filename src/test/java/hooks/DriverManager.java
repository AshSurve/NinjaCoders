package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;


public class DriverManager {
	
	static WebDriver driver; 
	
	public WebDriver initDriver(String browser) { 
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		
		// Set Page load timeout
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				

				return driver;
	}
	
	public static WebDriver getdriver() {
		if (driver==null) {
			driver = new FirefoxDriver();
			return driver;
		}
		else {
			return driver;
		}
	}
	public void closeallDriver() {
		driver.close();
	}

}
