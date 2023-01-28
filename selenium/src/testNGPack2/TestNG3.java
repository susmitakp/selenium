package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
  @Test
  public void method1() {
	  Reporter.log(" its method1",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log(" its method2",true);
  }
}
