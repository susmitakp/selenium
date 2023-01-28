package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Demo {
  public void demo() {
	 // System.out.println("This is method of Demo class ");
	  Reporter.log("This is method of demo method ",true);
  }
  
  public void demo1()
  {
	  Reporter.log("This is method of demo1 method ",true);
  }
  public void demo2()
  {
	  int a=10;
	  int b=2;
	  int c=a/b;
	  Reporter.log("This is method of demo2 method ",true);
  }
  public void demo3()
  {
	  String  s=null;
	 for(int i=0;i<=s.length()-1;i++)
	  {
		 char a= s.charAt(i);
		  Reporter.log(""+a,true);

	  }
  }



  
}
