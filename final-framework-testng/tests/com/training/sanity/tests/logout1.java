package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.logoutpom;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class logout1 {

	private static WebDriver driver;
	private static String baseUrl;
//	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static logoutpom logout;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	//	loginPOM = new LoginPOM(driver); 
		logout = new logoutpom(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

//	@AfterTest
//	public void setUp() throws Exception {
//		
//	}
//	
	
//	@Test
//	public void validLoginTest() throws InterruptedException {
//		loginPOM.sendUserName("Pradeep_20");
//		loginPOM.sendPassword("Pradeep123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//		Thread.sleep(3000);
//		
//	}
//	
	@Test
	public void validLogoutTest() {
		logout.clickLogoutBtn();
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		//logout.clickLogoutBtn();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
}