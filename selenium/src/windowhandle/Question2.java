package windowhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	// How to close parent window
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();//upcasting
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://omayo.blogspot.com/");
	//used to return parent window
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	  Thread.sleep(3000);
	  driver.close();

}
}