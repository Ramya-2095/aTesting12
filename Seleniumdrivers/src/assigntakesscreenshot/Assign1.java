package assigntakesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
       driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//input[@type='submit']")).submit();
       TakesScreenshot tsScreenshot=(TakesScreenshot) driver;
       File temp = tsScreenshot.getScreenshotAs(OutputType.FILE);
       File dest=new File("./Screenshots/"+time+".png");
       FileHandler.copy(temp, dest);
       
	}

}
