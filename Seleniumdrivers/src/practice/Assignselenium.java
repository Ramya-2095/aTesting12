package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignselenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ele);
		WebElement source1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dest = driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source1, dest).perform();
		WebElement source2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		act.dragAndDrop(source2, dest).perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(url.equals("https://www.globalsqa.com/sql-cheat-sheet/")) {
				break;
			}
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,970)");
		TakesScreenshot TS=(TakesScreenshot) driver;
         File temp = TS.getScreenshotAs(OutputType.FILE);
         File destFile=new File("./Screenshots/"+time+".png");
         FileHandler.copy(temp, destFile);
         
		
		
}
}
