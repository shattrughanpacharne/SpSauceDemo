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

public class TC03_Verify_BagProductFunctinality extends TestBaseClass{
	@Test
	public void verifyBagProductFunctinality() throws IOException {

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
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUserName();
		System.out.println("username is enterd");
		lp.sendPassword();
		System.out.println("password is enterd");
	    lp.clickOnButton();
		System.out.println("clicked on login button");
		*/
		
		
		///bag product
		HomePOMClass hp = new HomePOMClass(driver);
hp.clickBagButton();
log.info("bag product will get selected");
ScreenshotClass.takeScreenShot(driver);

		 log.info("apply the validation");
			String expectedProduct = "1";
			String actulProduct = hp.getTextFormAddToCart();
			/*if(expectedTitle.equals(actulTitle))
			{
				System.out.println("Bag product tc passed");
			}else {
				System.out.println("Bag product tc failed");
			}*/
			log.info("apply validation");
			Assert.assertEquals(actulProduct, expectedProduct);
		//	driver.quit();
			log.info("browser is closed");
		    
		    log.info("End of program");
	}

}
