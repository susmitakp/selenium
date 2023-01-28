package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo..blogspot.com/");
		driver.findElement(By.xpath("//a[.'open a popup window']")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
