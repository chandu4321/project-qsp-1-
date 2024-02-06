package selectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningMultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
//		WebElement dropDown = driver.findElement(By.id("s1"));
//		Select sel=new Select(dropDown);
//		System.out.println(sel.isMultiple());	o/t-false
		
		WebElement d = driver.findElement(By.id("m1"));
		Select sel=new Select(d);
		System.out.println(sel.isMultiple());	//o/t-true
		
//		sel.selectByVisibleText("Grapes");
//		Thread.sleep(3000);
//		sel.selectByVisibleText("Apple");
//		Thread.sleep(3000);
//		sel.deselectByVisibleText("Apple");
//		Thread.sleep(3000);
//		sel.selectByIndex(2);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(3);
	}

}
