package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM {

	public WebDriver driver;
	
	public PIM(WebDriver driver) {
		this.driver = driver;
	}
	
	public By PIM = By.xpath("//span[text()='PIM']");
	
	public By configuration = By.xpath("//span[text()='Configuration '] ");
	
	public By employeeList = By.xpath("//a[text()='Employee List']");
	
	public By addEmployee = By.xpath("//a[text()='Add Employee']");
	
	public By reports = By.xpath("//a[text()='Reports']");
	
	public By help = By.xpath("//button[@title='Help']");
}

