package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Three extends Base{
	
	public WebDriver driver;
	
	@Test
	public void testThree() {
		
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+ " from Edge");
		
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		driver = intializeBrowser("edge");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}

