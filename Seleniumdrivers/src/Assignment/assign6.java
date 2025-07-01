package Assignment;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/18");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(20000);
		Set<String> allwindowID = driver.getWindowHandles();
		for(String id:allwindowID)
		{
			driver.switchTo().window(id);
			Thread.sleep(10000);		 
			String url = driver.getCurrentUrl();
	        if(url.equals("https://www.flipkart.com/")) {
			Point position = driver.manage().window().getPosition();
			System.out.println(position.getX());
			System.out.println(position.getY());
			Thread.sleep(10000);
        	driver.manage().window().setPosition(new Point(10,250));
	        }
	         if(url.equals("https://www.ebay.com/")) {
	        	 Point position = driver.manage().window().getPosition();
	        	 System.out.println(position.getX());
	        	 System.out.println(position.getY());
	        	 Thread.sleep(10000);
	        	driver.manage().window().setPosition(new Point(800,250) );
	        }
		
		

		}	 
	}
	
}

