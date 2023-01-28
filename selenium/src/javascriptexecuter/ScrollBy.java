package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
	//	driver.get("https://dashboards.handmadeinteractive.com/jasonlove");
		//typecasting of javascript executer for handle disabled webelement
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,1500)");
		//js.executeScript("window.scrollBy(4000,0)");// scroll right
		//js.executeScript("window.scrollBy(-4000,0)");// scroll left


		Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)");//scroll down
	     Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,-1000)");//scroll up
	     Thread.sleep(3000);
        // js.executeScript("window.scrollBy(0,-1000)");//scroll down
	     
                 
       //  js.executeScript("window.scrollBy(4000,0)");//scroll right
 
		 		

	}

}
