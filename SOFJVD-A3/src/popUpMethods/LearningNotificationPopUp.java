package popUpMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNotificationPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.puma.com/");
		
//		Robot robot= new Robot();
//		Thread.sleep(2000);				    
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
