package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory  {
	
	WebDriver driver;
	/**
	 * This method is used to initilize the WebDriveron the basis on given browser
	 * @param browserName
	 * @return it returns webdriver 
	 */
	public WebDriver init_driver( String browserName) {
		
		if(browserName.equals("chrome")) {
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); 
			driver =new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\panka\\Downloads\\geckodriver.exe");
			 driver = new FirefoxDriver();
			}
			else if(browserName.equals("safari")) {

		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\panka\\Downloads\\geckodriver.exe");
				//Selenium internally maintain driver for safari
			 driver = new SafariDriver();
			}	
			else {
			System.out.println("please pass the correct brower  " + browserName);
			}

		  return driver;
	}
	
	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
