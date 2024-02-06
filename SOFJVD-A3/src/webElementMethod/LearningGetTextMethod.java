package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='First name is required.']")).getText());
	}

}
