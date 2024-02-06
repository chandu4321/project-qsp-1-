package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAboutRadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//is selected()
		System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected()); //false
		driver.findElement(By.id("pollanswers-1")).click();
		System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected()); //true
		
		//is enabled()
		System.out.println(driver.findElement(By.id("pollanswers-1")).isEnabled()); 
		
		
		//is displayed()
		System.out.println(driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed());
		
	}

}
