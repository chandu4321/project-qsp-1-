package batchExceutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_07 {
	@Test(groups = "FT")
	public void launchBookMyShow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		Thread.sleep(2000);
		driver.quit();
	}
}
