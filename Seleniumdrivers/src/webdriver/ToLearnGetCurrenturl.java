package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrenturl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.flipkart.com/")) {
			System.out.println("welcome page is displayed");
			
		}
		else {
			System.out.println("welcome page is not displayed");

		}
	}

}
