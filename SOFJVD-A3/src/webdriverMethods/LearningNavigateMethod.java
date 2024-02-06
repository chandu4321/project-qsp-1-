package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigateMethod {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}

}
