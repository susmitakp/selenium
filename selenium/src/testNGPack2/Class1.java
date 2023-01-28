package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(enabled= true)
 // (description="This test case is for SQL")
      //(enabled= true/false)
  public void sql() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("SQL");
	  
	  
  }
}
