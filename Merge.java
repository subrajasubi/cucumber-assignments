package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Merge extends BaseClass{

	@Then ("Click on Merge Leads Link")
	
	public void clickMergeLeads() {
		
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@When ("Click on Widjets on From Lead")
	
	public void clickWidjetsFromLead() {
		
		driver.findElement(By.xpath(("//img[@alt='Lookup']"))).click();
	}
	@Then  ("New Window should be opened")
	
	public void openNewWindow() {
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		System.out.println("New window is displayed");
	}
	
	@When ("Click the lead Id")
	
	public void clickLeadId() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("((//table[contains(@class,'row-table')])[1]/descendant::a)[1]")).click();
	}
	
	
	@Then ("Go back to the Original Window")
	
	public void originalWindow() {
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		System.out.println("Original window is displayed");
		
	}
	
	@When ("Click on SecondWidjets on To Lead")
	
	public void clickSecondWidjetsToLead() {
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
	}
	
	@Then ("Another New Window should be opened")
	
	public void openWindow() {
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}
	
	@When ("Click the Second Lead Id")
	
	public void clickSecondLeadId() {
		
		driver.findElement(By.xpath("((//table[contains(@class,'row-table')])[2]/descendant::a)[1]")).click();
	}

	
	@Then ("Go back to the  Window")
	
	public void gobackWindow() {
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
	}
	
	@When ("Click on the Merge Button")
	
	public void clickMergeButton() {
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	
	@Then ("Accept the Alert")
	
	public void acceptAlert() {
		
		driver.switchTo().alert().accept();
	}
	
	@Then ("Title should be displayed")
	
	public void titlePage() {
		
		boolean title = driver.findElement(By.xpath("//div[@class='titleBar']")).isDisplayed();
		
		Assert.assertTrue(title);
	}
	
	
	
	
}
