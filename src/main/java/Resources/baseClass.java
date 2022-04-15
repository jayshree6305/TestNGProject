package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public  WebDriver driver;//we declare it globally
	
	public WebDriver initializeDriver() throws IOException {
		//to read the properties file		//System.getProperty("user.dir")+\\src (it still same)
	FileInputStream fis= new FileInputStream("C:\\Users\\5ein\\eclipse-workspace\\E2ETestNGProjecct\\src\\main\\java\\Resources\\data.properties"); 
		
	//to get the access of data.properties
	Properties prop= new Properties();
	prop.load(fis);//we load it in the object of properties class
	String browserName= prop.getProperty("browser");//we use key here
	
	if(browserName.equals("chrome")) {
		// if chrome driver is update then code will not run
		//for that we use webdrivermanager to automatically add the updated driver
		//WebDriverManager.chromedriver().setup();
		//if we want to run in an specific version
		//WebDriverManager.chromedriver().browserversion().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\5ein\\Desktop\\Selenium jars\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox")){
		//firefox code
	}
	else if(browserName.equals("IE")) {
		//Internet Explorer code
	}
	else {
		System.out.println("you should choose any one of above browser");
	}
	return driver;
	}
	@BeforeClass
	public void launchBrowser() throws IOException {
		driver= initializeDriver();
		driver.get("https://login.salesforce.com/");
	}
	
	@AfterClass
	public void quitdriver() {
		driver.quit();
	}
	
}
