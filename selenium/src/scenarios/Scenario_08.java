package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_08 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='Allow']")).click();
		 Thread.sleep(3000);
		 WebElement  jewellery= driver.findElement(By.xpath("//a[@title='Jewellery'and(.='All Jewellery ')]"));
		 Actions act=new Actions (driver);
		 act.moveToElement(jewellery).perform();
		 Thread.sleep(3000);
         driver.findElement(By.xpath("//span[.='Kadas']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("pid_5675")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.=' Select Size ']/preceding-sibling::span[@class='icon-ion-android-arrow-dropdown']")).click(); //for size option
	//	act.doubleClick(size).perform();
		 driver.findElement(By.id("ringSizeHelpText")).click();
	}

}
