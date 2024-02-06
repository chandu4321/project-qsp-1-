package actionsClassMethod;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeyDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions=new Actions(driver);
//		actions.sendKeys(Keys.DOWN).perform();
//		actions.sendKeys(Keys.DOWN).perform();
//		actions.sendKeys(Keys.DOWN).perform();
		
		actions.sendKeys(Keys.PAGE_DOWN).perform();
	}

}
