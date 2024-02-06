package webDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningExplicityWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//explicit wait
		WebDriverWait wait= new WebDriverWait(driver,20);
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
		
		driver.findElement(By.id("register-button")).click();
		
	}

}
