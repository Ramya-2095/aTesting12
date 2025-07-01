package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwithTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/22");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowID = driver.getWindowHandles();
		for(String s:allwindowID) {
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(url.equals("https://www.flipkart.com/")) {
				String title = driver.getTitle();//if(url.contains("flipkart"))
				System.out.println(title);
				
			}
			else if(url.equals("https://www.ebay.com/")){
				driver.manage().window().maximize();
				
			}
			
			
		}
		
	}

}
