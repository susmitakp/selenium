package testNGPack2;
// alwaysrun Flag
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void m1() {
	  Assert.fail();
	  Reporter.log("method m1",true);
  }
  @Test(dependsOnMethods="m1",alwaysRun=true)
  public void m2()
  {
	 Reporter.log("method m2",true); 
  }
}
