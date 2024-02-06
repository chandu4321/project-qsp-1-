package popUpMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();//to click on ok button
		
		driver.switchTo().alert().dismiss(); // to click on cancel button

	}

}
