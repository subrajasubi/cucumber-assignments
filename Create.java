package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create extends BaseClass {
	
	@When("Click on {string} link")
	public void clickLink(String linkText) {
		
		driver.findElement(By.linkText(linkText)).click();
	}
	
	@Then("{string} Page should be displayed")

	public void verifyPage(String text) {
		
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+text+"']")).isDisplayed();
		
		 Assert.assertTrue(displayed);
	}
	
	
	@Given ("Enter the company name as {string}")
	
	public void enterCompanyName(String company) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	
    @And ("Enter the firstname name as {string}")
    
    public void enterFirstName(String fN) {
    	
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fN);
    }
	
    @And ("Enter the lastname name as {string}")
    
    public void enterLastName(String lN) {
    	
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lN);
    }
    
    @When ("Click on submit button")
    
    public void clickbutton() {
    	
    	driver.findElement(By.name("submitButton")).click();
    }
    
    @Then  ("Number should be displayed") 
    public String getNumber() {
    	
    	return driver.findElement(By.id("viewLead_companyName_sp")).getText();
    }
    
    @Then ("My Home Page should be displayed")
    
    public void homepageDisplay() {
    	
    	System.out.println("HomePage should be displayed");
    }
	}


