package TestNgScreenshots;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;

public class Screenshot_Example extends CommonMethods {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		screenshot("Screenshot_Example_launchBrowser");
		System.out.println("i am in @BeforeSuite method");
	}

	
	@BeforeClass
	public void launchURL() throws IOException {
		
		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		browserMaximize();	
		
		screenshot("Screenshot_Example_launchURL");
		
		System.out.println("i am in @BeforeClass method");		
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		waits();
		
		System.out.println("i am in @BeforeMethod method");		

	}
	
	@Test(priority = 1)
	public void enterUsername() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		screenshot("Screenshot_Example_enterUsername");
		
		System.out.println("i am in enterUsername method");	
	}
	
	@Test(priority = 2)
	public void enterPassword() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		screenshot("Screenshot_Example_enterPassword");
		
		System.out.println("i am in enterPassword method");	
	}
	

	@Test(priority = 3)
	public void clickLogin() throws IOException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		screenshot("Screenshot_Example_clickLogin");
		
		System.out.println("i am in clickLogin method");		
	}
	
	
	@AfterMethod
	public void waitingTime1() {
		
		waits();
		
		System.out.println("i am in @AfterMethod method");		

	}
	
	@AfterSuite
	public void closeBrowser() throws IOException {

	//	browserClosing();
		
		screenshot("Screenshot_Example_closeBrowser");
		
		System.out.println("i am in @aftersuite method");
		
	}	
	
	
	
}
