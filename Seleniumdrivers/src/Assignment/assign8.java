package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/18");
	driver.manage().window().maximize();
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	switchtowindow(driver, "https://www.amazon.in/");
	String title = driver.getTitle();
	System.out.println(title);
	switchtowindow(driver, "ebay");
	driver.close();
}
public static void switchtowindow(WebDriver driver,String expUrl) {
	Set<String> allwindowID = driver.getWindowHandles();
	for(String ID:allwindowID) {
		driver.switchTo().window(ID);
		String acturl = driver.getCurrentUrl();
		if(acturl.equals(expUrl)) {
			break;
		}
	}
}
}
