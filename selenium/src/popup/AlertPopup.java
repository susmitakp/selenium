package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/selenium/.html");
		 WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		 button.click();
		 Alert al = driver.switchTo().alert();// now switch control to Alert popup
		 Thread.sleep(2000);
		 al.accept(); //to accept alert popup
		// al.dismiss();
		// String textOfAlert = al.getText();
		// System.out.println(textOfAlert);
		// al.sendKeys("admin");
		 
		 
	}

}
