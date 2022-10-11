package com.SauceDemo.TestClass1;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass1.HomePOMClass;
import com.SauceDemo.POMClass1.LoginPOMClass;
import com.SauceDemo.UtilityClass1.ScreenshotClass;

public class TC02_Verify_LogOut_Functinality extends TestBaseClass{
	@Test
	public void verifyLogOutFunctinality() throws IOException {

		/*System.setProperty("webdriver.chrome.driver","F:\\spselenium\\chromedriver_win32 (1\\chromedriver.exe)");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maxmized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo url is opened");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screenshot
//		ScreenshotClass.takeScreenShot(driver);
		
		//login page elements find+ action perform
		LoginPOMClass x = new LoginPOMClass(driver);
		x.sendUserName();
		System.out.println("username is enterd");
		x.sendPassword();
		System.out.println("password is enterd");
	    x.clickOnButton();
		System.out.println("clied on login button");*/
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickMenuButton();
		log.info("clicked on menu button");
		//y.clickMenuButton();
		hp.clickLogOutButton();
		log.info("clicked on logout button");
	ScreenshotClass.takeScreenShot(driver);

		 log.info("apply the validation");
			String expectedTitle = "Swag Labs";
			String actulTitle = driver.getTitle();
			/*if(expectedTitle.equals(actulTitle))
			{
				System.out.println("logout functinality tc passed");
			}else {
				System.out.println("logout functinality tc failed");
			}*/
			Assert.assertEquals(actulTitle, expectedTitle);
		//	driver.quit();
			log.info("browser is closed");
		    
		    log.info("End of program");
	}

}
