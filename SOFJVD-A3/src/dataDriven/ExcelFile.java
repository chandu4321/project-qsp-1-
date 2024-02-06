package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		File file=new File("./dataDrivenFolder/testDataFromExcel.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wB=WorkbookFactory.create(fis);
		
		String name = wB.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		boolean opt = wB.getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(opt);
		
		double number = wB.getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
		System.out.println(number);
		
		Date date = wB.getSheet("Sheet1").getRow(4).getCell(0).getDateCellValue();
		System.out.println(date);
	}

}
