package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageObjectModel.signInPageObject;
import pageObjectModel.signUpPageObject;

@Test
public class verifySignUp extends baseClass {
	
	public void enterfields() throws InterruptedException {
		
		signInPageObject sin= new signInPageObject(driver);
		sin.clickontryforfree().click();
		Thread.sleep(5000);
	
		
		signUpPageObject sup = new signUpPageObject(driver);
		sup.firstname().sendKeys("jaya");
		sup.lastname().sendKeys("dubey");
		Thread.sleep(5000);
		
	
		sup.jobtitle().sendKeys("service");
		sup.email().sendKeys("jaya@gmail.com");
		sup.phone().sendKeys("7456337823");
		sup.company().sendKeys("infosys");
		
		//to select enployees from dropdown
		Select s1= new Select(sup.employees());
		s1.selectByIndex(2);
		
		//to select country from drpdown
		Select s2= new Select(sup.country());
		s2.selectByIndex(97);
		
		
		sup.mainserviceagreement().click();
			
		
		
		
	}
	
	

}
