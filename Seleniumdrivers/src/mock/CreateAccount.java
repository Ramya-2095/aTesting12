package mock;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement ele = driver.findElement(By.id("sView1:r1:0:country::content"));
		Select options=new Select(ele);
		List<WebElement> allopt = options.getOptions();
		options.selectByIndex(allopt.size()-1);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000)"); 
		driver.findElement(By.linkText("Oracle.com Terms of Use")).click();
		driver.findElement(By.xpath("//button[@class='icn-close acs-close']")).click();
		List<WebElement> headings = driver.findElements(By.tagName("h3"));
		System.out.println(headings.size());
		for(WebElement title:headings) {
			System.out.println(driver.getTitle());
		}
	}
	

}
