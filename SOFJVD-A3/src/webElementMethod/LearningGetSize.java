package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Dimension image = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getSize();
		System.out.println(image.getHeight());
		System.out.println(image.getWidth());
	}

}
