package com.SauceDemo.POMClass1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass {
	private WebDriver driver;
	private Select s;

	
	
	//2
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	//2
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	
	//4
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		//s= new Select(DropDown);
	}
	
	//bag ele
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagButton;
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		//add to cart ele
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement addToCart;
	
	public String getTextFormAddToCart()
	{
		String totalProducts=addToCart.getText();
		return totalProducts;
	}
	//multiple product element
	private List<WebElement>allProducts;
	
	public void clickAllProducts()
	{
		for(int i =0;i<allProducts.size();i++)
		{
			allProducts.get(i).click();
			
			//apply foreach loop assignment
			
		}}
			//dropdown ele find
			
			@FindBy(xpath=(""))
			private WebElement dropDown;
			
			public void clickDropdownFilter() {
				s.selectByValue("lohi");
			}
			
		}
	

