package testNGminiproject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscriptgiftcards extends Baseclass {
	@Test(groups = "smoke")
	public void clickongiftcards() {
		Hp=new Homepagedws(driver);
		Hp.getGiftcardslink().click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Gift Cards")) {
			Reporter.log("Giftcardpage is displayed",true);
		}else {
			Reporter.log("Giftcardpage is not displayed",true);

		}
	}

}
