package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnselectedoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/dropdown.html");
		WebElement car = driver.findElement(By.id("cars"));
		Select carselect=new Select(car);
		carselect.selectByIndex(1);
		WebElement first = carselect.getFirstSelectedOption();
		System.out.println(first.getText());
		

	}

}
