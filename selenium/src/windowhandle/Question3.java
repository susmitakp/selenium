package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	// How to get title of parent and child window
  public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		System.out.println("--------------------------------------");
		 Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			System.out.println(currentTitle);
			Thread.sleep(3000);
		}
}
}