package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestscriptElectronis extends Baseclass {
	@Test(groups="smoke")
	public void clickonElectronics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Electronics")) {
			Reporter.log("Electronics page is displayed",true);
		}
		else {
			Reporter.log("Electronics page is not displayed",true);

		}
	}

}
