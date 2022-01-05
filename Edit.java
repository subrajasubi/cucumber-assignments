package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit extends BaseClass{
	
	@When ("Click on Find Leads link")
	
	public void clickFindLeadsLink() {
		
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Then  ("CLick on Phone Button")
	
	public void clickPhoneButton() {
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	}
	
	@And ("Enter the PhoneNumber as {string}")
	
	public void enterPhonenumber(String phone) {
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	}
	
	@Then ("Click on Find Leads Button")
	
	public void clickFindleadsButton() {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@When ("Click on First Resulting Lead Id as {string}")
	
	public void clickLeadId(String id) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("((//table[contains(@class,'row-table')])[1]/descendant::a)[1]")).click();
	}
			
	@Then ("Click on Edit Button")
	
	public void clickEditButton() {
		
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@And ("Update the Company Name as {string}")
	
	public void updateCompanyName(String name) {
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(name);
	}
	
	@Then ("Click on Submit Button")
	
	public void clickSubmitButton() {
		
		driver.findElement(By.name("submitButton")).click();
	}
}
