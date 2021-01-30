package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
  static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//create a webelement--( using some locator) and perform  action on it(click, sendkeys, gettext())
		
//		1. first way to do actions
//		driver.findElement(By.id("input-email")).sendKeys("pratima.ranga@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen");
		
//		2.second way- benefit reusability , don't need to create webelement again and again 
//		WebElement email =driver.findElement(By.id("input-email"));
//		WebElement password =driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("pratima.ranga@gmail.com");
//		password.sendKeys("river");
		
//		3. By locator: Object Repository(OR), here not hitting the server again and again.
//		 By emailId = By.id("input-email");
//		 By password = By.id("input-password");
//		 
//		 driver.findElement(emailId).sendKeys("test@gmail.com");
//		 driver.findElement(password).sendKeys("clock");

//		Webelement will be created always on the basis of by locator
//		4. using function
		
//		getElement(emailId).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test123");
		
		By url = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
//		By jobTitle = By.id("Form_submitForm_JobTitle");
		By submitBtn = By.id("Form_submitForm_action_request");
		
//		getElement(url).sendKeys("testautomation");
//		getElement(firstname).sendKeys("pratima");
//		getElement(lastname).sendKeys("automation");
//		getElement(submitBtn).click();
		
//		5. generic functions for the actions(wrapper method over action methods)
		doSendKeys(url,"testautomation");
		doSendKeys(firstname,"Riya");
		doSendKeys(lastname,"pillai");
		doClick(submitBtn);

		
		// 6. by creating  element utility class out of generic functions		
		//	simply create object of utility class and start using the methods
		
		//7. by creating webdriver factory utility which will give driver and browser related method like launchUrl,getTitle, getCurrentUrl, quit, close
		//	simply create object of utility class and start using the methods
	}

	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		  getElement(locator).sendKeys(value);
	}
}
