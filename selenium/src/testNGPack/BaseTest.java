package testNGPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  
 @Test
  public void setUp() {
	 
	  
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("http://127.0.0.1/login.do;jsessionid=6cb5hp35ns5nt");
	  }
	  
}	

