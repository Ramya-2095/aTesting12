package Assignwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.vtiger.com/vtigercrm/");
       WebElement unTF = driver.findElement(By.xpath("//input[@id='username']"));
       unTF.clear();
       Thread.sleep(20000);
       unTF.sendKeys("Selenium");
       WebElement pwTF = driver.findElement(By.xpath("//input[@id='password']"));
       pwTF.clear();
       Thread.sleep(20000);
       pwTF.sendKeys("test@1234");
       driver.findElement(By.xpath("//button[@type='submit']")).submit();
       Thread.sleep(15000);
       driver.close();
}
}
