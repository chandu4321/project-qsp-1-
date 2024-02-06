package selectClassMethods;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement opt = driver.findElement(By.id("products-orderby"));
		opt.click();
		Select sel=new Select(opt);
		//to check the dropdown is Multiple
		//System.out.println(sel.isMultiple());
		//Thread.sleep(2000);
		//select the option using visible text
		//sel.selectByVisibleText("Name: A to Z");
		
		List<WebElement> options = sel.getOptions();
		for(WebElement v:options) {
			System.out.println(v.getText());
			
		}
	}
}
