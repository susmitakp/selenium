package screenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ThridWay {
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	      RemoteWebDriver rwd=(RemoteWebDriver) driver;
	      rwd.manage().window().maximize();
	      rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	      driver.get("http://127.0.0.1/login.do;jsessionid=1f4q5s41jqkh1");
	      driver.findElement(By.name("username")).sendKeys("admin");
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
          driver.findElement(By.xpath("//a[.='Login']")).click();
          driver.findElement(By.xpath("//div[.='Work Schedule']")).click();
	      

}
}