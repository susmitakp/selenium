package assignement1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HpAssignement {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//for popup
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("hp laptop ");// for blinking active element
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//for search 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();//for processor i7 checkbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand' and(@class='_2gmUFU _3V8rao')]")).click();// for brand
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();// for hp checkbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();//for operating system
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();//for windows
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();//customor rating
		Thread.sleep(2000);
		String price_of_laptop = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='₹1,04,900']")).getText();
		System.out.println("price of laptop "  + price_of_laptop);
		Thread.sleep(2000);
		driver.quit();
	
}
}