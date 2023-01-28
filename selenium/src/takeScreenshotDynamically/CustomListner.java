package takeScreenshotDynamically;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomListner {
  @Override
  public void onTestStart(ITestResult result) {
  }
  @Override
  public void onTestFailure(ITestResult result)
  {
	 String methodName = result.getMethod().getMethodName(); 
	 Reporter.log("the name of"+methodName+"is failed");
	 failed(methodName);
	 
  }
  @Override
  public void onTestSkipped(ITestResult result)
  {
	  
  }
  
  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result)
  {
	  
  }
}
