package assignLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Assign6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.redbus.in/");
      driver.findElement(By.xpath("//span[contains(text(),'Train')]")).click();
      Thread.sleep(20000);
      driver.findElement(By.xpath("//span[contains(text(),'Live train')]")).click();
      driver.findElement(By.xpath("//p[contains(text(),'Live Train')]")).click();
      Thread.sleep(20000);
      driver.findElement(By.xpath("//div[@class='train-container-wrapper']/../..//button[@class='availability-button']")).click();

}
}
//button[@class='availability-button']
//div[@class='train-container-wrapper']