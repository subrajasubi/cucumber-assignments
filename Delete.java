package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Delete extends BaseClass{
		
  @Then ("Click on Delete Button")
  
  public void clickDeleteButton() {
	  
	  driver.findElement(By.linkText("Delete")).click();
  }
  

  @Given ("Enter the Lead Id as {string}")
  
  public void enterLeadId(String id) {
	  
	  driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
  }
  

  
  @Then ("HomePage should be displayed")
  public void verifyHomePage() {
	  
	  System.out.println("Homepage should be displayed");
  }
  
  
  
}
