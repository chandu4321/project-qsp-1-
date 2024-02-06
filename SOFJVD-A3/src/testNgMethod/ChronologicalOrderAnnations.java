package testNgMethod;

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

public class ChronologicalOrderAnnations {

	@Test
	public void testScript() {
		Reporter.log("test script passed",true);
	}
	
	@AfterClass
	public void browserClose() {
		Reporter.log("Browser has closed",true);
	}
	
	@BeforeClass
	public void launch() {
		Reporter.log("Browser has launched",true);
	}
	
	@BeforeSuite
	public void connection() {
		Reporter.log("connected to DataBase",true);
	}
	
	@BeforeTest
	public void preCond() {
		Reporter.log("Pre conditions to open appln",true);
	}
	
	@AfterTest
	public void postCond() {
		Reporter.log("Post condition close appln",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login has successfully done",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("user has logout the appln",true);
	}
	
	@AfterSuite
	public void closeconn() {
		Reporter.log("close the conn for DataBase",true);
	}
	
}
