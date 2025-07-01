package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestscriptApparel extends Baseclass {
	@Test(groups="system")
	public void clickonApparel() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Apparel & Shoes")) {
			Reporter.log("Apparel & Shoes page is displayed",true);
		}
		else {
			Reporter.log("Apparel & Shoes page is not displayed",true);

		}
	}

}
