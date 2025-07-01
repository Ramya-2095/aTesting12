package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver.ToLearngetwindowHandle;

public class assign5 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
		{
			System.out.println("web page is displayed");
		}
		else {
			System.out.println("webpage is not displayed");
		}
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.quit();
	}

}
