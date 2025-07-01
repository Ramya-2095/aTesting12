package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement rbutton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@id='pollanswers-2']"));
		System.out.println(rbutton.isSelected());
		rbutton.click();
		System.out.println(rbutton.isSelected());

		

	}

}
