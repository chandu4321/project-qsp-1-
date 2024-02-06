package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file= new File("./dataDrivenFolder/testDataFromExcel.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		
		String key = wb.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(key);
		String path = wb.getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();
		//System.out.println(path);
		String url = wb.getSheet("Sheet2").getRow(4).getCell(2).getStringCellValue();
		//System.out.println(url);
		
		System.setProperty(key, path);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
	
	}

}
