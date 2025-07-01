package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Accountassign2 {
	@Test
	public void create_account() {
		Reporter.log("account has been created succesfully",true);
	}
	@Test(dependsOnMethods = "create_account")
	public void edit_account() {
		Reporter.log("account has been edited succesfully",true);
	}
	@Test(dependsOnMethods = {"edit_account","create_account"})
	public void delete_account() {
		Reporter.log("account has been deleted succesfully",true);
	}

}
