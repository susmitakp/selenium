package assignement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobile {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//for popup cross button
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("samsung mobile");//for search box
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); //for 
		Thread.sleep(2000);
		String pricemobile=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("mobile price is "+pricemobile);
		}

}
