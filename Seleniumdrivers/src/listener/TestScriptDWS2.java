package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (ImplementationDWS.class)
public class TestScriptDWS2 extends BaseclassDWS{
	@Test
	public void electronics() {
		driver.findElement(By.linkText("Electron")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics"," Electronics page is not displayed");
		Reporter.log("Electronics page is displayed",true);
	}

}
