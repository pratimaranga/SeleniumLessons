package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	 //if we maintain static function,driver should also be static everytime and it will not help at the time of parallel execution .
	//	i.e not not a proper usage of object oriented concept. that is why we avoid static for such utility
	// constructor will be called when object of this class is called
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

}
