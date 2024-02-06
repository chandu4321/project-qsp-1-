package batchExceutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_06 {
	@Test
	public void launchPizza() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/");
		Thread.sleep(2000);
		driver.quit();
	}
}
