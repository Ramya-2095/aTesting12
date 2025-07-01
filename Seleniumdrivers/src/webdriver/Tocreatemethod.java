package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocreatemethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/22");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		switchtowindow(driver, "flipkart");
		Point position = driver.manage().window().getPosition();
		switchtowindow(driver, "ebay");
		Point ebposition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(position);
		switchtowindow(driver, "flipkart");
		Thread.sleep(10000);
		driver.manage().window().setPosition(ebposition);
		
		}
	public static void switchtowindow(WebDriver driver,String expUrl) throws InterruptedException {
		Set<String> allwindowID = driver.getWindowHandles();
		for(String id:allwindowID) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(expUrl)) {
			break;
			}
			
		}
	}

}
