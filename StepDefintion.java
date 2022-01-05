package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends BaseClass{
	
	
	
	@Given("Enter the username as {string}")
	
     public void enterUsername(String username) {
	  
		driver.findElement(By.id("username")).sendKeys(username);
     }
	@Given("Enter the password as {string}")
  
    public void enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	  
    }
	
	@When("Click on login button")
	
	public void CLickLogin() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
    
	@Then("Homepage should be displayed")
  
    public void VerifyHomePage() {
		
	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

    if(displayed) {
    	
    	System.out.println("Homepage should be displayed");
    }
    else {
    	System.out.println("Homepage is not displayed");
    }
	}
	
	@But("Error message  should be displayed")
	
	public void VerifyErrorMessage() {
		
		System.out.println("Error message  should be displayed");
	}
	
	

}