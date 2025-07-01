package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assigndws {
	@Test(dataProviderClass = DatastorageDWS.class,dataProvider = "register1")
	public void dwsRigister(String[] cred) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("./TestData/demowebcommondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		Registerpage RP=new Registerpage(driver);
		RP.getRegisterlink().click();
		RP.getFirstnameTF().sendKeys(cred[0]);
		RP.getLastnameTF().sendKeys(cred[1]);
		RP.getEmailTF().sendKeys(cred[2]);
		RP.getPasswordTF().sendKeys(cred[3]);
		RP.getConfirmPWTF().sendKeys(cred[4]);
	}

}
