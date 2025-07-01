package Assignwebelement;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement element = driver.findElement(By.xpath("//label[text()='Excellent']"));
         System.out.println(element.isDisplayed());
         element.click();
         boolean rbutton = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@id='pollanswers-1']")).isSelected();
         System.out.println(rbutton);
}
}
