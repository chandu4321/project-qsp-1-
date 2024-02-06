package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaningQuitMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
		
	}
}
