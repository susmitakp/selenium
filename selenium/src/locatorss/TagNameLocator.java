package locatorss;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.faceook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("sona");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("sona123");
		driver.findElement(By.id("u_0_5_Ge")).click();
		
		
		
		
	}

	 

	
	}

	

