package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus") )
				{
		System.out.println("web page is displayed");
		}
		else {
			System.out.println("Webpage is not displayed");
		}
		driver.quit();
	}

}
