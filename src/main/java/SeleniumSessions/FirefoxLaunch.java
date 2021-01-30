package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\panka\\Downloads\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else { System.out.println("in-correct title");}
		
		System.out.println(driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());
		
//		driver.quit();
		
	}


}
