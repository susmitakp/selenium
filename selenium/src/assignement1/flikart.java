package assignement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flikart {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//for popup
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("samsung mobile");// for blinking active element
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//for search 
		Thread.sleep(2000);
		String price_of_mobile = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='₹12,499']")).getText();
		System.out.println("price of mobile "  + price_of_mobile);
		
				
	}

}
