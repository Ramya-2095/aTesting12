package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/dropdown.html");
		WebElement cars = driver.findElement(By.id("cars"));
		Select carSelect=new Select(cars);
		carSelect.selectByIndex(0);
		carSelect.selectByValue("2");
		carSelect.selectByVisibleText("Suzuki");
		carSelect.deselectByIndex(0);
		carSelect.deselectAll();
		

	}

}
