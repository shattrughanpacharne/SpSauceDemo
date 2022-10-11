package com.SauceDemo.TestClass1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.SauceDemo.POMClass1.LoginPOMClass;
import com.SauceDemo.UtilityClass1.ScreenshotClass;

public class TC01_LogIn_Functinality extends TestBaseClass{
	@Test
public void verifyLoginFunctinality() throws IOException {
	/*System.setProperty("webdriver.chrome.driver","F:\\spselenium\\chromedriver_win32 (1)\\chromedriver.exe)");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("browser is maxmized");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("SauceDemo url is opened");
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//take screenshot
	ScreenshotClass.takeScreenShot(driver);
	
	//login page elements find+ action perform
	LoginPOMClass x = new LoginPOMClass(driver);
	x.sendUserName();
	System.out.println("username is enterd");
	x.sendPassword();
	System.out.println("password is enterd");
    x.clickOnButton();
	System.out.println("clied on login button");*/
	//home page
	ScreenshotClass.takeScreenShot(driver);
	
    log.info("apply the validation");
	String expectedTitle = "Swag Labs";
	String actulTitle = driver.getTitle();
	/*if(expectedTitle.equals(actulTitle))
	{
		System.out.println("log in functinality tc passed");
	}else {
		System.out.println("login functinality tc failed");
	}*/
	Assert.assertEquals(actulTitle, expectedTitle);
	//driver.quit();
	log.info("browser is closed");
    
	log.info("End of program");
    
    
    
    
    
    
    
    
    
    
    
    


}
}
