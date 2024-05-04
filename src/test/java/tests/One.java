package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base{
	
	public WebDriver driver;
	
	@Test
	public void testOne() {
		
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+ " from Chrome");
		
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		driver = intializeBrowser("chrome");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
