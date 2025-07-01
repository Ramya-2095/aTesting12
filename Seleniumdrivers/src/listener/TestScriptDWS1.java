package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ImplementationDWS.class)
public class TestScriptDWS1 extends BaseclassDWS{
	@Test
	public void computers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers"," computer page is not displayed");
		Reporter.log("computer page is displayed",true);
	}

}
