package testNG;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import pomassign.Loginpagefacebook;

public class Facebookassign {
	@Test
	public void facebook() throws IOException {
		
	

	FileInputStream fis=new FileInputStream("./TestData/facebookcommondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	Loginpagefacebook Lfb=new Loginpagefacebook(driver);
	Lfb.getEmailTF().sendKeys(email);
	Lfb.getPasswordTF().sendKeys(password);
	Lfb.getLoginbutton().click();
	String time = LocalDateTime.now().toString().replace(":", "-");	
	WebElement ele = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
	if(ele.isDisplayed()) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/"+time+".png");
	FileHandler.copy(temp, dest);

	}
	
	}

}
