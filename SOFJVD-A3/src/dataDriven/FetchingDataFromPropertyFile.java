package dataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FetchingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		//1)Create a File Object and give the path were you have stored data
		File file= new File("./dataDrivenFolder/testData.properties");
		
		//2)Create a Object for FileInputStream
		FileInputStream fis=new FileInputStream(file);
		
		//3)Create a Object for your Property File
		Properties p= new Properties();
		
		//4)call the read method
		p.load(fis);
			
		String BrowserKey = p.get("key").toString();
		String browserPath = p.get("path").toString();
		String URL = p.get("url").toString();
		
		System.out.println(BrowserKey);
		System.out.println(browserPath);
		System.out.println(URL);
		
		System.setProperty(BrowserKey, browserPath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);	
		}
}
