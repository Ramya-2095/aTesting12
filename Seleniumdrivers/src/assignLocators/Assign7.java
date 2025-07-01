package assignLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoapps.qspiders.com/");
   Thread.sleep(20000);
   driver.findElement(By.xpath("//p[contains(text(),'UI Testing')]")).click();
   Thread.sleep(15000);
   driver.findElement(By.xpath("//section[text()='Web Table']")).click();
   Thread.sleep(15000);
   String discount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
   System.out.println(discount);
   String price = driver.findElement(By.xpath("//th[text()='HP Envy']/following-sibling::td[4]")).getText();
   System.out.println(price);
   driver.close();
	}

}
