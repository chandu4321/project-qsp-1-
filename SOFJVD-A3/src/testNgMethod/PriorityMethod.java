package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityMethod {
	
	@Test(priority = 1)
	public void account() {
		Reporter.log("user account",true);
	}
	
	@Test(priority = -1)
	public void register() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test(priority = 3)
	public void delect() {
		Reporter.log("user deleted the account",true);
	}
	
	@Test(priority = 2)
	public void product() {
		Reporter.log("user selected a product",true);
	}
	
	
}
