package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assisn {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots"+time+".png");
		FileHandler.copy(temp, dest);
		driver.findElement(By.linkText("Vtiger")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String s:ids) {
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.vtiger.com/")){
				break;
			}
				
		}
		WebElement comp = driver.findElement(By.id("companyDropdown"));
		Actions act=new Actions(driver);
		act.moveToElement(comp).perform();
		driver.findElement(By.linkText("Contact Us")).click();
		 String phonenum = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/..//p[@class='font-size-sm mb-0']")).getText();
		System.out.println(phonenum);
	}

}
