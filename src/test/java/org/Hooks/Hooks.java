package org.Hooks;

import org.TestData.TestData;
import org.openqa.selenium.WebDriver;
import org.pom.login_page;

import Cucumber.Framework.TestBase_class;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase_class {
	login_page pom_login;
  WebDriver driver;
	
	@Before
	public void setup() {	
	launchbrowser();
	geturl(TestData.url);	
	maximizebrowser();
	implicitwaits(TestData.seconds);
	pom_login = new login_page(driver);

     }
	
	
	@After
	public void teardown() {
		quitdriver();
	}
	
	
	

}
