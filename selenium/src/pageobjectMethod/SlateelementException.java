package pageobjectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlateelementException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.jsp");
		WebElement usn = driver.findElement(By.name("username"));
	 WebElement pass = driver.findElement(By.name("pwd"));
	 usn.sendKeys("admin");
	 System.out.println(usn);
	 Thread.sleep(2000);
	 
	 pass.sendKeys("manager");


	 
		driver.findElement(By.id("loginButton")).click();
	

	}
	   

}
