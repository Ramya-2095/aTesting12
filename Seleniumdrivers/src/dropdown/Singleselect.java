package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/r.php?entry_point=login");
		 WebElement day = driver.findElement(By.id("day"));
		 Select daySelect=new Select(day);
		 daySelect.selectByIndex(14);
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select monthSelect=new Select(month);
		 monthSelect.selectByValue("8");
		 WebElement year = driver.findElement(By.id("year"));
		 Select yearSelect=new Select(year);
		 yearSelect.selectByVisibleText("1947");
		 
		 //ExpectedCondtion.visibilityof(element address)

	}

}
