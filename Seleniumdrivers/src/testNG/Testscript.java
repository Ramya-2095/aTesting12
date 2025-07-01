package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends Baseclass{
	@Test(groups="integration")
	public void clickbooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop. Books")) {
			Reporter.log("Bookspage is displayed",true);
		}
		else {
			Reporter.log("Bookspage is not displayed",true);

		}
	}

}
