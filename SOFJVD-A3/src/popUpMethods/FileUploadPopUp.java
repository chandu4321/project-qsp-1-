package popUpMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		Robot robot= new Robot();
		
		
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_U);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_U);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}

}
