package popUpMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningCalendarPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.via.com/");
		String date="31";
		driver.findElement(By.id("departure")).click();
		//driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[1]/../..//div[text()='25']")).click();
		
		driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[1]/../..//div[text()='"+date+"']")).click();
		
		
	}

}
