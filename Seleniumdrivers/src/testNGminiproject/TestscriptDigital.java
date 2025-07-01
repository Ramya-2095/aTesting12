package testNGminiproject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestscriptDigital extends Baseclass {
	@Test(groups="smoke")
	public void clickondigital() {
		Hp=new Homepagedws(driver);
		Hp.getDigitallink().click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Digital downloads")) {
			Reporter.log("digital downloadpage is displayed",true);
		}
		else {
			Reporter.log("digital downloadpage is not displayed",true);

		}
	}

}
