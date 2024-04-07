package hooks;

import io.cucumber.java.Before;
import pageobjects.DataStructurePage;

public class Hooks {

DataStructurePage dsp=new DataStructurePage();
@Before("@DSIntroduction1")	
public void homeloggedin() {
		
		//dsp.chklogin();
	}
	
	
}