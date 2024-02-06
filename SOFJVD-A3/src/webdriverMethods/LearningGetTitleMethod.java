package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTitleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//To Get the Title of The Application:
		System.out.println(driver.getTitle());

	}

}
