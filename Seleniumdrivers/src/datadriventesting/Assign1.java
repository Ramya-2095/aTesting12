package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
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
		FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password1"));
		driver.findElement(By.id("login-button")).click();
		TakesScreenshot TS=(TakesScreenshot) driver;
		File temp = TS.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		
		

	}

}
