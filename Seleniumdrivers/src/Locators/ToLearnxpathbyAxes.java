package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnxpathbyAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Movietable.html");
		String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
		System.out.println(collection);
		String position = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
		System.out.println(position);
		
		
	}

}
