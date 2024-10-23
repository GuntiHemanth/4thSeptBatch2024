package Methods;

import org.openqa.selenium.WebDriver;

import Pages.PIM;

public class PIM_Method {

	public WebDriver driver;
	
	public PIM_Method(WebDriver driver) {
		
		this.driver = driver;
	}
	
	PIM p = new PIM(driver);
	
	public void verifyPIM() {
		driver.findElement(p.PIM).isDisplayed();
	}
	
	public void clickPIM() {
		driver.findElement(p.PIM).click();
	}
	
	
	public void verifyConfiguration() {
		driver.findElement(p.configuration).isDisplayed();
	}
	
	public void clickConfiguration() {
		driver.findElement(p.configuration).click();
	}
	
	public void verifyEmpList() {
		driver.findElement(p.employeeList).isDisplayed();
	}
	
	public void clickEmpList() {
		driver.findElement(p.employeeList).click();;
	}
	
	public void verifyAddEmployee() {
		driver.findElement(p.addEmployee).isDisplayed();
	}
	
	public void clickAddEmployee() {
		driver.findElement(p.addEmployee).click();
	}
	
	
	public void verifyReports() {
		driver.findElement(p.reports).isDisplayed();
	}
	
	public void clickReports() {
		driver.findElement(p.reports).click();
	}
	
	public void verifyHelp() {
		driver.findElement(p.help).isDisplayed();
	}
	
	public void clickHelp() {
		driver.findElement(p.help).click();
	}
	
	
}
