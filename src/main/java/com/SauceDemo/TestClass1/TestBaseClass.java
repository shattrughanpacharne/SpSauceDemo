  package com.SauceDemo.TestClass1;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass1.LoginPOMClass;
import com.SauceDemo.UtilityClass1.ScreenshotClass;

public class TestBaseClass {
	WebDriver driver;
	Logger log=Logger.getLogger("SauceDemo1");
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException {
		if(browserName.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","F:\\spselenium\\chromedriver_win32 (1\\chromedriver.exe)");

			System.setProperty("webdriver.chrome.driver","./DriverFiles1\\chromedriver.exe)");
			
			 driver = new ChromeDriver();
			System.out.println("browser is opened");
		}else
		{
		//	System.setProperty("webdriver.chrome.driver","F:\\spselenium\\chromedriver_win32 (1)\\chromedriver.exe)");

		System.setProperty("webdriver.gecko.driver","./DriverFiles1\\geckodriver.exe)");
			
			 driver = new FirefoxDriver();
			System.out.println("browser is opened");
		}
		PropertyConfigurator.configure("log4j.properties");
			log.info("Browser is opened");
			
			driver.manage().window().maximize();
			log.info("Browser is maxmized");
			
			driver.get("https://www.saucedemo.com/");
			log.info("URL is opned");
			
			ScreenshotClass.takeScreenShot(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			//login
			LoginPOMClass lp = new LoginPOMClass(driver);
			lp.sendUserName();
			log.info("username is enterd");
			lp.sendPassword();
			log.info("password is enterd");
		    lp.clickOnButton();
			log.info("clicked on login button");
			
			
			
			

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("browser is  closed");
	}
	

}
