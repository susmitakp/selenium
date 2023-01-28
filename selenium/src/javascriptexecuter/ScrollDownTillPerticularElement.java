package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTillPerticularElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
    	//typecasting of javascript executer for handle disabled webelement
   // 	Javascriptexecuter js=(Javascriptexecuter)driver;		
    //	WebElement rubyElement = driver.findElement(By.xpath("//p[.='Ruby']"));//for ruby element
		WebElement rubyElement1 = driver.findElement(By.xpath("//p[.='Python']"));//for ruby element
	//	WebElement rubyElement = driver.findElement(By.xpath("//body[@class='td-section']"));
			

		
		Point point = rubyElement1.getLocation();
		int xaxis=point.getX();
		int yaxis=point.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		System.out.println(xaxis);
		System.out.println(yaxis);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-500)+")");

	}

}
