package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	static WebDriver driver;
	public static void main(String[] args) {

		String browser = "IE";
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		else if(browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\panka\\Downloads\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {

		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\panka\\Downloads\\geckodriver.exe");
			 driver = new SafariDriver();
		}	
		else {
			System.out.println("please pass the correct brower  " + browser);
		}

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("page title is : " + title);

		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());

		driver.quit();
	}
}
