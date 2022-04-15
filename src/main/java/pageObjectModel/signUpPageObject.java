package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObject {
	public WebDriver driver;
	
	private By firstname= By.xpath("//input[@name='UserFirstName']");
	private By lastname= By.xpath("//input[@name='UserLastName']");
	private By jobtitle= By.xpath("//input[@name='UserTitle']");
	private By email= By.xpath("//input[@name='UserEmail']");
	private By phone= By.xpath("//input[@name='UserPhone']");
	private By company= By.xpath("//input[@name='CompanyName']");
	private By employees= By.xpath("//select[@name='CompanyEmployees']");
	private By country= By.xpath("//select[@name='CompanyCountry']");
	
	private By mainserviceagreement= By.xpath("//div[@class='checkbox-ui']");

	public signUpPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver= driver2;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	public WebElement jobtitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement phone() {
		return driver.findElement(phone);
	}
	public WebElement company() {
		return driver.findElement(company);
	}
	public WebElement employees() {
		return driver.findElement(employees);
	}
	public WebElement country() {
		return driver.findElement(country);
	}
	public WebElement mainserviceagreement() {
		return driver.findElement(mainserviceagreement);
	}

	
	
}
