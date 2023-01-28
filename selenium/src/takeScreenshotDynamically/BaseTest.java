package takeScreenshotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BaseTest 
{
	static WebDriver driver;
  public void initialization() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://127.0.0.1/login.do;jsessionid=6cb5hp35ns5nt");
  }
 public void failed(String methodName)
 {
  TakesScreenshot ts=(TakesScreenshot)driver;
  File src = ts.getScreenshotAs(OutputType.FILE);
  File dest = new File("./screenShot/"+"methodName"+".png");
		  
  
  
  }
}
