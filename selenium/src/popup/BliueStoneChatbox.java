package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BliueStoneChatbox {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(3000);
		 WebElement chatbox = driver.findElement(By.id("fc_widget"));
			Thread.sleep(3000);
	   driver.switchTo().frame(chatbox);
	   Thread.sleep(3000);
	  driver.findElement(By.id("chat-icon")).click();
	   Thread.sleep(3000);
	   driver.switchTo().defaultContent();
	  driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
	  Thread.sleep(2000);
	 // driver.findElement(By.id("chat-fc-email")).sendKeys("pooja@gmail.com");
	   

}


		
		
		
		
		
		
		
		
		
		
		
		
		
	}
