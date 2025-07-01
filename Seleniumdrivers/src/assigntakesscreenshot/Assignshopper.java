package assigntakesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignshopper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Power");
		driver.findElement(By.xpath("//input[@name='Last Name']")).sendKeys("Star");
		driver.findElement(By.xpath("//span[text()='Male']/..//input[@id='Male']")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9614067018");
		driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("abhimaani@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Appu@143");
		driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Appu@143");
		driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
		driver.findElement(By.xpath("//button[@id='btnDisabled']")).click();
		
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhimaani@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Appu@143");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		boolean txt = driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		if(txt==true) {
			TakesScreenshot TS=(TakesScreenshot) driver;
		       File temp = TS.getScreenshotAs(OutputType.FILE);
		       File destFile=new File("./Screenshots/"+time+".png");
		       FileHandler.copy(temp, destFile);
		}
		
		
		
		
	
	}
}
