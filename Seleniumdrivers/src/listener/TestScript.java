package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplimentation.class) 
public class TestScript extends Baseclass {
@Test
public void login()  {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("rammu1234@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("rammu@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Homepage is not displyed");
	Reporter.log("Home page is displyed",true);
	



	
}
}
