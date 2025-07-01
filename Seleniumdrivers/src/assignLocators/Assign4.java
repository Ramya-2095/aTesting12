package assignLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Loginpage.html");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("//input[7]")).click();

	}

}
