package keywordDrivenFramework;

import java.io.IOException;
import java.sql.DriverAction;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {


		// TODO Auto-generated method stub
		public void openBrowser() throws IOException
		{
			Flib flib = new Flib();

			String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
			String url = flib.readPropertyData(PROP_PATH,"Url");


			if(browserValue.equals("chrome"))
			{
				System.setProperty(CHROME_KEY,CHROME_VALUE);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
			}


			else if(browserValue.equals("firefox"))
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
			}
			else
			{
				System.out.println("enter the valid browserValue!!!");
			}

		}
		public void closeBrowser()
		{
			ChromeDriver.quit();
		}

	}
