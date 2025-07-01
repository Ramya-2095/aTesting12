package assigntakesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign2demoweb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String time = LocalDateTime.now().toString().replace("-", ":");
		driver.get("https://demowebshop.tricentis.com/");
		//JavascriptExecutor JS=(JavascriptExecutor) driver;
		//JS.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[contains(text(),'inch Laptop')]/../..//input[@value='Add to cart']")).click();
		File temp = driver.findElement(By.xpath("//div[@id='bar-notification']")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/message.png");
		FileHandler.copy(temp, destFile);
	}

}
