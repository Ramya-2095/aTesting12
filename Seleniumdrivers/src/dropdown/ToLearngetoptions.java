package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearngetoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/dropdown.html");
		WebElement sel = driver.findElement(By.id("cars"));
		Select carSelect=new Select(sel);
		List<WebElement> alloptions = carSelect.getOptions();
		System.out.println(alloptions.size());
		for(WebElement ele:alloptions) {
			System.out.println(ele.getText());

		}
		

	}

}
