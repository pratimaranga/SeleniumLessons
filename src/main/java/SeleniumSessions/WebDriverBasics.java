package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
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
		
		driver.quit();
	}
	
}

