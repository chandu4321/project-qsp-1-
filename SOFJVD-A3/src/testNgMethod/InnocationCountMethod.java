package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnocationCountMethod {

	@Test(invocationCount = 2)
	public void account() {
		Reporter.log("user account",true);
	}
	
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void register() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test(invocationCount = 1)
	public void delect() {
		Reporter.log("user deleted the account",true);
	}
	
	@Test(invocationCount = 4)
	public void product() {
		Reporter.log("user selected a product",true);
	}
}
