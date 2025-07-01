package Assignwebelement;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		  Set<String> ids = driver.getWindowHandles();
		  for(String s:ids) {
			  driver.switchTo().window(s);
			  String url = driver.getCurrentUrl();
				System.out.println(url);
				if(url.equals("https://www.vtiger.com/")) {
					break;
				}
		  }
		driver.findElement(By.xpath("//span[@id='loginspan']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(20000);
		String errmsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(errmsg);
		String color = driver.findElement(By.xpath("//p[@id='com-form-login-error']")).getCssValue("color");
		System.out.println(color);
		String Bgclr = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-color");
		System.out.println(Bgclr);
		driver.switchTo().window(parentid);
		Thread.sleep(5000);
		driver.quit();

		
		
		
	}

}
