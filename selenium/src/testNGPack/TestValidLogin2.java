package testNGPack;

import java.time.Duration;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	static WebDriver driver;
  @Test
  @Parameters("Browser","Url","usn","Pass")
  public void method1(String browserValue,String Url,String Username,String Password) {
	  if(browserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(Url);
	  }
	  else if(browserValue.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(Url);
		  
	  }
	  else
	  {
		  Reporter.log("Enter the valid browser value",true);
	  }
  }
}
