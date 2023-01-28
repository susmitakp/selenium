package screenshot;

import java.io.File;


import com.google.common.io.Files;

public class SECONDWAY2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		File src = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./screenshot/SecondWay.jpg");
        Files.copy(src,dest);
}



	}


