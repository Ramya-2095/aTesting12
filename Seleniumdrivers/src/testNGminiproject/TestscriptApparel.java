package testNGminiproject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestscriptApparel extends Baseclass {
@Test(groups = "intigration")
public void clickonApparel() {
	Hp=new Homepagedws(driver);
	Hp.getApparellink().click();
	String title = driver.getTitle();
	if(title.equals("Demo Web Shop. Apparel & Shoes")) {
		Reporter.log("Apparel page is displayed",true);
	}
	else {
		Reporter.log("Apparel page is not displayed",true);

	}
}
}
