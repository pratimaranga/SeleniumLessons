package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
//		driver.manage().window().fullscreen();
//		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//ChromeDriver: chrome on WINDOWS (07d0474f20ea821c2b088519fc071520) session ID
		String title = driver.getTitle();
		
		//ChromeDriver: chrome on WINDOWS (07d0474f20ea821c2b088519fc071520)
		System.out.println("page title is : " + title);
		
				
//		driver.quit();// close the browser
		//ChromeDriver: chrome on WINDOWS (07d0474f20ea821c2b088519fc071520)
		
		driver.close();// close the browser
//		ChromeDriver: chrome on WINDOWS (07d0474f20ea821c2b088519fc071520)	
		
	System.out.println(driver.getTitle());
		//ChromeDriver: chrome on WINDOWS (47de73f54a851c17a9fca0801914db9f)
	}

}
