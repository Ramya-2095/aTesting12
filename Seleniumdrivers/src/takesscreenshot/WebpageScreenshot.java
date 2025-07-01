package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String time = LocalDateTime.now().toString().replace(":", "-");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      TakesScreenshot TS=(TakesScreenshot) driver;
      File temp = TS.getScreenshotAs(OutputType.FILE);
       File dest = new File("./Screenshots/"+time+".png");
      FileHandler.copy(temp, dest);
      
      }

}
