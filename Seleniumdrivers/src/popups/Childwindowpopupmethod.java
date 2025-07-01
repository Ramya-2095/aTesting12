package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopupmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.findElement(By.id("compare")).click();
		switchtowindow(driver, "flipkart");
		String title = driver.getTitle();
		System.out.println(title);
		switchtowindow(driver, "https://www.ebay.com/");
		driver.close();
		switchtowindow(driver, "https://www.shoppersstack.com/products_page/18");
		driver.close();
		

	}
	public static void switchtowindow(WebDriver driver,String expturl) {
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expturl)) {
			break;
		}
	}

	}
}


