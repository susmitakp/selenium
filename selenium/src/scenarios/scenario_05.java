package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario_05 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(3000);
		
		 WebElement  ring = driver.findElement(By.xpath("//a[.='Rings ']"));
		 Actions act= new Actions(driver);
		 act.moveToElement(ring).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Diamond Rings'and(.='Diamond')]")).click();//for Diamond option
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[.=' Popular ']")).click();
		  driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		 Thread.sleep(8000);
		driver.close();
		
      
	}

}
