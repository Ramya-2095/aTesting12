package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignfresher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\Desktop\\Rashmi rashu 8th Eng.docx");
		driver.navigate().back();
		WebElement ele = driver.findElement(By.xpath("//li[@id='dropdown-trinst']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();

		

	}

}
