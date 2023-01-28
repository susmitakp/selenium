package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.instagram.com");
		Thread.sleep(2000);
		driver.close();
		String   titleOfWebPage=driver.getTitle();
		System.out.println(titleOfWebPage);
		
		
		
	}

}
