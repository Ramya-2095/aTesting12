package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		switchtowindow(driver, "https://www.facebook.com/nopCommerce");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		switchtowindow(driver, "https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2FnopCommerce");
		WebElement ele = driver.findElement(By.id("month"));
		Select optSelect=new Select(ele);
		//optSelect.selectByIndex(11);
		//optSelect.selectByValue("12");
		List<WebElement> opt = optSelect.getOptions();
		int size = opt.size();
		optSelect.selectByIndex(size-1);
		TakesScreenshot TS=(TakesScreenshot) driver;
		File temp = TS.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, destFile);
		
}
	public static void switchtowindow(WebDriver driver,String expturl) {
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expturl)) {
				break;
			}
		}
		
	}
}