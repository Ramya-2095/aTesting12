package assignLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		if(title.equals(title)) {
			System.out.println("webpage is displayed");
		}
		else {
			System.out.println("webpage is not displyed");
		}
		driver.findElement(By.cssSelector("input[value='Vote']")).click();
		}

}
