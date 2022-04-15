package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import pageObjectModel.signInPageObject;

public class verifySignIn extends baseClass {
	@Test(dataProvider="demo")
	public void entervalue(String username, String password) throws InterruptedException {
		signInPageObject sin= new signInPageObject(driver);
		sin.enterusername().sendKeys(username);
		sin.enterpassword().sendKeys(password);
		sin.clickonlogin().click();
		
		Thread.sleep(5000);
		
		/*String actual= driver.findElement(By.xpath("//div[@id='error']")).getText();
		String Expected = "Your acces to salesforce.com has been disabled by your system administrator. Please contact your Administrator for more information.";
		//Assert.assertEquals(actual, Expected);//hard assert
		
		SoftAssert sp =new SoftAssert(); // soft assert
		sp.assertEquals(actual, Expected);
		System.out.println("Hello");
		sp.assertAll(); //we need to add this in end always 
		*/
	}
		@DataProvider
		public Object[][] demo(){
			Object[][]data = new Object[2][2];
			
			//valid data
			data[0][0]= "test1@gmail.com";
			data[0][1]= "secure123";
			
			//invalid data
			data[1][0]= "test2@gmail.com";
			data[1][1]= "secure345";
			
			return data;
			
		}
	
	
	
	
	
	}
	
	


