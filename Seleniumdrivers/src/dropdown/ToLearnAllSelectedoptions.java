package dropdown;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnAllSelectedoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/dropdown.html");
		WebElement car = driver.findElement(By.id("cars"));
		Select carSelect=new Select(car);
		carSelect.selectByIndex(0);
		carSelect.selectByIndex(1);
		carSelect.selectByIndex(2);
		boolean mul = carSelect.isMultiple();
		System.out.println(mul);
		List<WebElement> allsel = carSelect.getAllSelectedOptions();
		System.out.println(allsel.size());
		for(WebElement ele:allsel) {
			System.out.println(ele.getText());
		}
		

	}

}
