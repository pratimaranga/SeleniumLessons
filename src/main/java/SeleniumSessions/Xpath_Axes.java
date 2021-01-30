package SeleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=  new ChromeDriver();
		 
		 driver.get("https://www.espncricinfo.com/series/big-bash-league-2020-21-1226769/perth-scorchers-vs-sydney-thunder-34th-match-1226878/full-scorecard");
		
        // //a[text()='Ali Baba']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		// //a[text()='Boby Kanami']//parent::td//preceding-sibling::td/input[@type='checkbox']
		 
//		 String scoretext =driver.findElement(By.xpath("//a[text()='Ashton Turner']//parent::td/following-sibling::td/span")).getText();
//		 System.out.println(scoretext);
		 
		 
//		System.out.println( getWicketName ("Ashton Turner"));
//		System.out.println(getWicketName ("Colin Munro"));
		 
//		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='Ashton Turner']//parent::td//following-sibling::td"));
//		for(int i=1;i<scoreList.size();i++) {
//			String text=scoreList.get(i).getText();
//			System.out.print(text +" ");
//		}
		 
//		 getPlayerScoreCard("Ashton Turner" );
		 getPlayerScoreCard("Colin Munro" ).stream().forEach(ele -> System.out.print(ele +" "));
		 getPlayerScoreCard("Ashton Turner" ).stream().forEach(ele -> System.out.print(ele +" "));
	}
	

	public static String getWicketName ( String playerName){
	 String text =driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td/following-sibling::td/span")).getText();
	 return text;
	 
	}
	
	public static List<String> getPlayerScoreCard(String playerName ) {
		System.out.println(" ");
		System.out.print(playerName + "--> ");
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		for(int i=1;i<scoreList.size();i++) {
			String text=scoreList.get(i).getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}
	
}

