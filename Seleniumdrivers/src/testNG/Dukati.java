package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dukati {
	@Test(groups="smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ducati.com/in/en/home");
		Reporter.log("Launched ducati",true);
		}

}
