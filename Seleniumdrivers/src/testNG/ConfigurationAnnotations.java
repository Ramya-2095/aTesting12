package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("@beforesuite",true);
	}
	@BeforeTest
	public void befortest() {
		Reporter.log("@beforetest",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("@beforeclass",true);
	}
	@BeforeMethod
	public void beformethod() {
		Reporter.log("@beforemethod",true);	
		}
	@Test
	public void demo() {
		Reporter.log("@test (demo) executed",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("@aftermethod",true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("afterclass",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("@aftertest",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("@aftersuite",true);
	}
}
