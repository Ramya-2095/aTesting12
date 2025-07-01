package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnConfiramationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Alert popup = driver.switchTo().alert();
		String msg = popup.getText();
		System.out.println(msg);
		popup.accept();
		String msg1 = popup.getText();
		System.out.println(msg1);
		popup.accept();
		
	}

}
