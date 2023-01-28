package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestValidCreds {

	public static void main(String[] args) throws  EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.jsp");
		// for username
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
	     Workbook wb = WorkbookFactory.create(fis); //make the file for read
	     Sheet sheet = wb.getSheet("validcreds");// take sheet name
		  Row row = sheet.getRow(1); // get value of row by passing row number
		  Cell cell = row.getCell(0);  // get value of cell
		   String username= cell.getStringCellValue(); // it will gives value present in cell
		// for password
		   FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		     Workbook wb2 = WorkbookFactory.create(fis2); //make the file for read
		     Sheet sheet2 = wb.getSheet("validcreds");// take sheet name
			  Row row2 = sheet2.getRow(1); // get value of row by passing row number
			  Cell cell2 = row2.getCell(1);  // get value of cell
			   String password= cell2.getStringCellValue(); // it will gives value present in cell
			
		 
		 
		 
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	

		
	}

}
