package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_01 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("sonamukharji7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//div[@class='OabDMe cXrdqd Y2Zypf']")).sendKeys("sona1234");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
	}

}
