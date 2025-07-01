package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String clr = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
		System.out.println(clr);
		String size = driver.findElement(By.xpath("//div[@class='message-error']")).getCssValue("font-size");
		System.out.println(size);														

	}

}
