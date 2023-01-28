package qsp1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rrtp {
	static WebDriver  driver;
	public static void main (String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browservalue= sc.nextLine();
		
		if(browservalue.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
			  driver= new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
			
		}
		else if (browservalue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			  driver= new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		
		}else {
			System.out.println("enter valid browser");
		}
			
	}

}
