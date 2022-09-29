package testngScreenshots;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

public class Base {
	static WebDriver   driver;
	public static void Initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinut\\eclipse-workspace\\Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	public static  void screenshot(String testMethodName)
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(scr,new File("C:\\Users\\vinut\\eclipse-workspace\\Demo_Selenium\\Screenshot.jpg" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
