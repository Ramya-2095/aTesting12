package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.shoppersstack.com/products_page/21");
	        driver.findElement(By.id("compare")).click();
	        Set<String> allid = driver.getWindowHandles();
	        for(String id:allid) {
	        	driver.switchTo().window(id);
	        	String url = driver.getCurrentUrl();
	        	//if(url.contains("https://www.flipkart.com/")) {
	        	if(url.contains("https://www.amazon.in/")) {
	        		break;
	        	}
	        }
	        String title = driver.getTitle();
	        System.out.println(title);
	        //driver.close();
	}

}
