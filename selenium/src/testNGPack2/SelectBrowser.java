package testNGPack2;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
@Parameters("browserValue","url")

public class SelectBrowser {
	WebDriver driver;
  public void openBrowser(String browser,String url) 
  {
	  if(browser.equals("chrome"))
	  {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	  }
	  else
	  {
		  Reporter.log("open valid browser",true);
	  }
  }
}
