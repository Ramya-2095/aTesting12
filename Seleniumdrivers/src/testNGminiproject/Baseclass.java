package testNGminiproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
	Homepagedws Hp;
	Welcomepagedws wp;
	Loginpagedws Lp;
	
		@BeforeClass(alwaysRun = true)
				
		public void openbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fis=new FileInputStream("./TestData/demowebcommondata.properties");
		prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		fis=new FileInputStream("./TestData/demowebcommondata.properties");
		 prop=new Properties();	
		 prop.load(fis);
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");

		 wp=new Welcomepagedws(driver);
		 wp.getLoginlink().click();
		  Lp=new Loginpagedws(driver);
		 Lp.getEmailTF().sendKeys(email);
		 Lp.getPasswordTF().sendKeys(password);
		 Lp.getLoginbutton().click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Hp=new Homepagedws(driver);
		Hp.getLogoutlink().click();
		
	} 
	
		
	
	@AfterClass(alwaysRun = true)
	public void closebroweser() {
		driver.close();
		
	}

}
