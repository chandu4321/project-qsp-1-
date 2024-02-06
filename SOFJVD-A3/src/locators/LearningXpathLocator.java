package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		//you identity uding your text
		driver.findElement(By.xpath("//a[text()='Register']"));
		
		//your identify using attribute
		driver.findElement(By.xpath("//input[@value='Subscribe']"));
		
		//using contains method for attribute
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]"));

		
		//using contains for text
		driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2024')]"));
	}

}
