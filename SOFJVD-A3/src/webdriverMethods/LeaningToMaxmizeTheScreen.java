package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaningToMaxmizeTheScreen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//To Maximize The Window:
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}

}
