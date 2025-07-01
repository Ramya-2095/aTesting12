package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscriptcomputer extends Baseclass {
	@Test(groups="smoke")
	public void clickoncomputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Computers")) {
			Reporter.log("Computers page is displayed",true);
		}
		else {
			Reporter.log("Computers page is not displayed",true);

		}
	}
	

}
