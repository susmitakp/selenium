package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
public static int main(String[] args, String sheetName) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./data/ActiTimeTestData");
	 Workbook wb = WorkbookFactory.create(fis);
	 org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheet(sheetName);
	  int rc = ((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();
	   return rc;		
	


}
}