package testngScreenshots;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(customListener.class)
public class Screenshot extends Base {
	@BeforeMethod
	public static void start()
	{
		Initialization();
	}
	@Test
	public  static void screenshot()
	{
		Assert.assertEquals(false, true);
	}
	@AfterMethod
	public static void terminate()
	{
		driver.quit();
	}

}
