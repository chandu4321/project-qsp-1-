package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sa=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getTitle(),"Demo Web Shop","EC is not Matched with AC");
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","page is not nagivated to register");
		driver.findElement(By.id("gender-female")).click();
		sa.assertTrue(true, "its not clicked on female radio button");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("chandana");
		sa.assertEquals(firstName.getAttribute("value"), "chandana","first name is not matched");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("n");
		sa.assertEquals(lastName.getAttribute("value"), "n","last name is not matched");
		sa.assertAll();

	}

}
