package screenshot;

import java.io.File;
import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;



public class SecondWay {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	      RemoteWebDriver rwd=(RemoteWebDriver) driver;
	      rwd.manage().window().maximize();
	      rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	      driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
		    File src = driver.getScreenshotAs(OutputType.FILE);
	        File dest=new File("./screenshot/SecondWay.jpg");
	        Files.copy(src,dest);
	}

}
