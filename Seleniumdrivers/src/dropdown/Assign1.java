package dropdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assign1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		WebElement position = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select name=new Select(position);
		name.selectByIndex(2);
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select page=new Select(display);
		page.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");
		WebElement view = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select grid=new Select(view);
		grid.selectByVisibleText("List");
		//TakesScreenshot TS=(TakesScreenshot) driver;
		//File temp = TS.getScreenshotAs(OutputType.FILE);
		//File destFile=new File("./Screenshots/"+time+".png");
		//FileHandler.copy(temp, destFile);
		//driver.close();
		}

}
