package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test 
	public void register() {
		Reporter.log("User has registered");
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("user has login");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		Reporter.log("user has logout");
	}
	
}
