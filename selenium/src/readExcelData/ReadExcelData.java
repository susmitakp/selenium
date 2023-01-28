package readExcelData;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException { 
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
     Workbook wb = WorkbookFactory.create(fis); //make the file for read
     Sheet sheet = wb.getSheet("IPL");// take sheet name
	  Row row = sheet.getRow(3); // get value of row by passing row number
	  Cell cell = row.getCell(1);  // get value of cell
	   String data = cell.getStringCellValue(); // it will gives value present in cell
	
	    System.out.println(data);
	
	}

}
