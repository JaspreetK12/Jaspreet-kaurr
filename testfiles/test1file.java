package testfiles;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import localfiles.amazontest;



public class test1file extends amazontest {
	
	 amazontest at;
		String actualTitle;
		
	@BeforeSuite
	public void Launch() throws InterruptedException
	{
		initialization();
		at=new amazontest();
	}
	
	@Test
    public void ()throws InterruptedException{
		at.sign().sendKeys("user");;
		
	}
//    @AfterTest
//    public void teardown() {
//        driver.quit();
//    }
}


