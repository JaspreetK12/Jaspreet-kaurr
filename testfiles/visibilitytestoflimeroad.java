package testfiles;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class visibilitytestoflimeroad  extends limeroadbase {
	limeroadpage lp;
	String actualTitle;
	
@BeforeSuite
public void Launch() throws InterruptedException 
{
	initialization();
	lp=new limeroadpage();

}
@Test(priority=1)
public void clicklogowomen()throws InterruptedException{
	lp.lgwomen().click();
	
}
@Test(priority=2)
public void logo()throws InterruptedException{

	Thread.sleep(3000);
	Assert.assertEquals(lp.vibilitylogo().isDisplayed(),true);
	System.out.println("logo is displayed");
	
}
@Test(priority=3)
public void menlogo()throws InterruptedException{

	Thread.sleep(3000);
	Assert.assertEquals(lp.menlogo().isDisplayed(),true);
	System.out.println("logo is displayed");
}
@Test(priority=4)
public void kidslogo()throws InterruptedException{

	Thread.sleep(3000);
	Assert.assertEquals(lp.kidslogo().isDisplayed(),true);
	System.out.println("logo is displayed");
}
@Test(priority=5)
public void homelogo()throws InterruptedException{

	Thread.sleep(3000);
	Assert.assertEquals(lp.homelogo().isDisplayed(),true);
	System.out.println("logo is displayed");
}
@Test(priority=6)
public void offerlogo()throws InterruptedException{

	Thread.sleep(3000);
	Assert.assertEquals(lp.offerlogo().isDisplayed(),true);
	System.out.println("logo is displayed");
}
}

