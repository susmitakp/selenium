package methodsofwebbrowser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTomethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
	     driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		
			Thread.sleep(3000);

		driver.navigate().back();
		
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
	  driver.navigate().refresh();
	   Thread.sleep(3000);

		driver.close();


	}

}
