package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		JavascriptExecutor JS=(JavascriptExecutor) driver;
		JS.executeScript("window.scrollTo(0,7500)");
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']")).click();
		//List<WebElement> price = driver.findElements(By.xpath("//span[text()='₹']/..//span[text()='1,488']"));	
		//for(WebElement ele:price) {
			//System.out.println(ele.getText());
		//}
		List<WebElement> price = driver.findElements(By.xpath("//span[text()='From']/../..//span[text()='₹']"));
		ArrayList<Integer>prices=new ArrayList<>();
		for(WebElement ele:price) {
			System.out.println(ele.getText());
			String amount = ele.getText();
			  String pri = (amount.replaceAll("₹",""));
			//.add(amount);
		}
		
}
}