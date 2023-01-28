package takeScreenshotDynamically;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
@Listeners(CustomListner.class)
public class ActitimeTestNgLogin extends BaseTest
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
  public void loginPage() {
	 SoftAssert sa = new SoftAssert();
	String actualLoginPageTitle = driver.getTitle();
	 AssertJUnit.assertEquals( actualLoginPageTitle,"actiTIME - Login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
  public void homePage() throws InterruptedException {
	  SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		 AssertJUnit.assertEquals( actualLoginPageTitle,"actiTIME - Login");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  
		  
		  Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		  AssertJUnit.assertEquals(actualLoginPageTitle, "actiTIME -Time-Track");
		  Thread.sleep(2000);
		  driver.findElement(By.id("SubmitTTButton")).click();
  }
  @AfterMethod
@AfterMethod
@AfterMethod
  public void tearDown()
  {
	  driver.quit();
	  
  }
}
