package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	// How to close child window ?
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		//used to return parent window
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		  String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println("--------------------------------------");
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			System.out.println(wh);
			Thread.sleep(3000);
			if(!parentWindow.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
			else
			{
           
			}
		}

}
}