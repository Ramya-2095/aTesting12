package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dest = driver.findElement(By.id("trash"));
		Actions act= new Actions(driver);
		act.dragAndDrop(source, dest).perform();
		WebElement source2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		act.dragAndDrop(source2, dest).perform();
		
		
	}

}
