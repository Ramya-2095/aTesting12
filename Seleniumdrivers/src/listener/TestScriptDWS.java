package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ImplementationDWS.class)
public class TestScriptDWS extends BaseclassDWS {
	@Test
	public void books() {
		driver.findElement(By.partialLinkText("Books")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","books page is not displayed");
		Reporter.log("books page is displayed",true);

	}

}
