package mock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456");
		driver.findElement(By.linkText("GET APP LINK")).click();
		String errormsg = driver.findElement(By.id("errorMob")).getText();
		System.out.println(errormsg);
		driver.switchTo().defaultContent();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,4000)");
		driver.findElement(By.linkText("About Us")).click();
		switchtowindow(driver,"https://www.dreamsports.group/");
		driver.findElement(By.linkText("Dream Responsibly")).click();
		switchtowindow(driver,"https://www.dreamsports.group/dream-responsibly/");
		driver.findElement(By.linkText("Dream Stories")).click();
	}
	public static void switchtowindow(WebDriver driver,String expurl) {
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.equals(expurl)) {
				break;
			}
			
		}
		
	}

}
