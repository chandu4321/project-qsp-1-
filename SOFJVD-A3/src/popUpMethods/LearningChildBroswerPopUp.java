package popUpMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningChildBroswerPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		
		String parentWindowId = driver.getWindowHandle();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		System.out.println(parentWindowId);
		System.out.println(allWindowId);
		
		allWindowId.remove(parentWindowId);
		
		for(String i:allWindowId) {
			driver.switchTo().window(i);
			Thread.sleep(3000);
			driver.close();
		}
	}
}
