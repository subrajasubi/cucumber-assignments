package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class Duplicate extends BaseClass{

	
	@When ("Click on the resulting name") 
	
	public void clickResultingName() throws InterruptedException {
		
		Thread.sleep(5000);
		
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();		
	}

	
	@When ("Click on Duplicate Button")
	
	public void clickDuplicateButton() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
	}
}	


