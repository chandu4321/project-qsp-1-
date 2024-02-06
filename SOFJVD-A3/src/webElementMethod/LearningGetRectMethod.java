package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Rectangle search = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println(search.getHeight());
		System.out.println(search.getWidth());
		System.out.println(search.getX());
		System.out.println(search.getY());
	}

}
