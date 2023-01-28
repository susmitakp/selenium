package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FirstWay {

	public static void main(String[] args) throws IOException {
		// full page screenshot = first way
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.selenium.dev/downloads/");
         WebElement ex = driver.findElement(By.xpath("//div[@class='row justify-content-center px-5 pb-5']"));
      File src = ex.getScreenshotAs(OutputType.FILE);
      File dest=new File("./screenshot/FirstWay1.jpg");
      Files.copy(src, dest);
	}

}
