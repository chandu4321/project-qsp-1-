package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardAssertMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(),"Demo Web Shop","EC is not Matched with AC");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","page is not nagivated to register");
		driver.findElement(By.id("gender-female")).click();
		assertTrue(true, "its not clicked on female radio button");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("chandana");
		assertEquals(firstName.getAttribute("value"), "chandana","first name is not matched");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("n");
		assertEquals(lastName.getAttribute("value"), "n","last name is not matched");
		
	}

}
