package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest {
	
  @Test
  public void validLogin() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(3000);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(3000);
	  driver.findElement(By.id("loginButton")).click();
	
	  
  }
}
