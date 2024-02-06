package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetCurrentUrlMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//To Get the Current URL of the Application:
		System.out.println(driver.getCurrentUrl());
	}

}
