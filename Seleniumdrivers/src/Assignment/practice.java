package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.linkText("Vtiger")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.vtiger.com/")) {
				break;
			}
		}
			driver.findElement(By.id("loginspan")).click();
			driver.findElement(By.name("username")).sendKeys("Selenium@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Test@1234");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			WebElement error = driver.findElement(By.id("com-form-login-error"));
			System.out.println(error);
			//String msg = error.getText();
			//System.out.println(msg);
			String clr = error.getCssValue("color");
			System.out.println(clr);
			
			
		
		
		
		
	}

	}
	


