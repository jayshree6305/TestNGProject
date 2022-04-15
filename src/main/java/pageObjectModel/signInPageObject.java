package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPageObject {
	public WebDriver driver;//this driver dosent have scope 
							// constructor will give this driver a scope
	
private By username= By.xpath("//input[@id='username']");
private By password= By.xpath("//input[@id='password']");
private By login = By.xpath("//input[@id='Login']");

private By Tryforfree= By.xpath("//a[@id='signup_link']");

public signInPageObject(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver= driver2;
}

public WebElement enterusername() {
	return driver.findElement(username);
}

public WebElement enterpassword() {
	return driver.findElement(password);
}

public WebElement clickonlogin() {
	return driver.findElement(login);
}
public WebElement clickontryforfree() {
	return driver.findElement(Tryforfree);
}
}
