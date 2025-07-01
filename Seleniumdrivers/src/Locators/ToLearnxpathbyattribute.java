package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpathbyattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.id("Email")).sendKeys("ramya.abhi95@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("Ram@123");
		//driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
