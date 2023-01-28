package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebelement {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/javaexecuter.html");
		//typecasting of javascript executer for handle disabled webelement
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("i1"));
		 WebElement password = driver.findElement(By.id("i2"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 if(username.isEnabled())
		 {
			 username.sendKeys("manager");
			 System.out.println("if block is executed");
		 }
		
		// else
		 //{
			// Thread.sleep(1000);
			 //js.executeScript("document.getElementById('i1').value='admin'");
			// js.executeScript("document.getElementById('i1).value='manager'");
			// System.out.println("else block is executed");
	//	 }

		 if(password.isEnabled())
		 {
			 password.sendKeys("manager123");
			 System.out.println("if block is executed");
		 }
		// else
		// {
	//		 js.executeScript("document.getElementById('i2).value='manager123'");
			// System.out.println("else block is executed");

			 
		 }
 		
		
		
		

	}

//}
