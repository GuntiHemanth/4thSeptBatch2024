package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;
import Methods.PIM_Method;
import Pages.LoginPage;


public class TC_3_PIM_Test extends CommonMethods {

	LoginPage lp;
	PIM_Method pim;
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		browserLaunching("chrome");
		lp = new LoginPage(driver);
		pim = new PIM_Method(driver);
		
		screenshot("TC_3_PIM_Test_launchBrowser");
		System.out.println("i am in @BeforeSuit method");
	}
	
	@BeforeClass
	public void launchURL() throws IOException {
		
		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		browserMaximize();
		
		screenshot("TC_3_PIM_Test_launchURL");
		System.out.println("i am in @BeforeClass method");	
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		waits();
		
		System.out.println("i am in @BeforeMethod method");		

	}	
	
	@Test(priority = 1)
	public void enterUsername() throws IOException {
		
		lp.enterUsername();;
		
		screenshot("TC_3_PIMTest_enterUsername");
		
		System.out.println("i am in enterUsername method");	
	}
	
	@Test(priority = 2)
	public void enterPassword() throws IOException {
		
		lp.enterPassword();
		
		screenshot("TC_3_PIMTest_enterPassword");
		
		System.out.println("i am in enterPassword method");	
	}
	
	@Test(priority = 3)
	public void clickLogin() {		

		lp.clickLogin();
		
		System.out.println("i am in clickLogin method");		
	}
	
	@Test(priority = 4)
	public void verify_PIM() throws IOException {
		pim.verifyPIM();
		screenshot("TC_3_PIMTest_verify_PIM");
		System.out.println("i am in verify PIM method");
	}
	
	@Test(priority = 5)
	public void click_PIM() throws IOException {
		pim.clickPIM();
		screenshot("TC_3_PIMTest_click_PIM");
		System.out.println("i am in click PIM method");
	}
	
	@Test(priority = 6)
	public void click_Configuration() throws IOException {
		pim.clickConfiguration();
		screenshot("TC_3_PIMTest_click_configuration");
		System.out.println("i am in click configuration method");
	}
	
	@Test(priority = 7)
	public void click_EmpList() throws IOException {
		pim.clickEmpList();;
		screenshot("TC_3_PIMTest_click_empList");
		System.out.println("i am in click employee list method");
	}
	
	@Test(priority = 8)
	public void click_AddEmployee() throws IOException {
		pim.clickAddEmployee();
		screenshot("TC_3_PIMTest_click_AddEmployee");
		System.out.println("i am in click add employee method");
	}
	
	
	@Test(priority = 9)
	public void click_Reports() throws IOException {
		pim.clickReports();
		screenshot("TC_3_PIMTest_click_Reports");
		System.out.println("i am in click reports method");
	}
	
	@Test(priority = 10)
	public void click_Help() throws IOException {
		pim.clickHelp();
		screenshot("TC_3_PIMTest_click_Help");
		System.out.println("i am in click help method");
	}
	
	
	@AfterMethod
	public void waitingTime1() {
		
		waits();
		
		System.out.println("i am in @AfterMethod method");		

	}
	
	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("TC_3_PIM_Test_closeBrowser");
		
		System.out.println("i am in @Aftersuite method");
		
		//browserClosing();

	}
	
	
	
	
}
