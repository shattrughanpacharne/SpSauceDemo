package com.SauceDemo.POMClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	//we will just find the elements here
	
		//1.WebDriver declared
		private WebDriver driver;
		//we are not following this concept here
		//driver.findElement(By.xpath("username xpath));
		// username.sendkeys();
		//2.annotations  its a like short cut of method
		//replacement for findElement method
		private Actions act;
		
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement username;
		
		//or
		//@FindBy(id="user-name")
		//WebElement username1;
		//3.perform action of webElemengt
		//use this action inn on method
		
		
		public void sendUserName()
		{
			username.sendKeys("standard_user");
		}
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		////input[@id='user-name']
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
			
		}
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement loginButton;
		
		//3
		public void clickOnButton()
		{
			loginButton.click();
			
		}
		//create a constructor
		public LoginPOMClass(WebDriver driver)
		{
		this.driver	 = driver;
		//sele class
		PageFactory.initElements(driver, this);
		act= new Actions(driver);
		}

}
