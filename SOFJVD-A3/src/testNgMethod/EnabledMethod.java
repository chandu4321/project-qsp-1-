package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledMethod {

	@Test(enabled = true)
	public void account() {
		Reporter.log("user account",true);
	}
	
	@Test(enabled = false)
	public void register() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test()
	public void delect() {
		Reporter.log("user deleted the account",true);
	}
}
