package com.UrbanLadderCucumberCS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLaddercucumberCS1.UiStore.UrbanLadderHomePageUi;

public class UrbanLadderHomePageObjects {
	WebDriver driver;
	UrbanLadderHomePageUi hpui=new UrbanLadderHomePageUi();
	public UrbanLadderHomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickingSearchBox()
	{
		return driver.findElement(hpui.clicksearchBox);
	}
	
	public WebElement clickingSearchButton()
	{
		return driver.findElement(hpui.clicksearchButton);
	}
	
	public WebElement Checkingitem()
	{
		return driver.findElement(hpui.BedCheck1);
	}
	
	public WebElement ClosingPopup()
	{
		return driver.findElement(hpui.closingpopup);
	}
	public WebElement ClickingAboutUs()
	{
		return driver.findElement(hpui.aboutus);
	}
	public WebElement AboutLadderpara()
	{
		return driver.findElement(hpui.aboutladder);
	}
	public WebElement PriceHomeDecor()
	{
		return driver.findElement(hpui.homedecor);
	}
	/*public WebElement clickingtvicon()
	{
		return driver.findElement(hpui.tvicon);
	}
	public WebElement clickingtv()
	{
		return driver.findElement(hpui.tvclick);
	}
	public WebElement checkwarranty()
	{
		return driver.findElement(hpui.warranty);*/
	//}
	
	public WebElement clickinggiftcards()
	{
		return driver.findElement(hpui.giftcardicon);
	}
	public WebElement clickingrect()
	{
		return driver.findElement(hpui.rectilinearicon);
	}
	public WebElement checkrect()
	{
		return driver.findElement(hpui.iconrectclick);
	}
	public WebElement itemscount()
	{
		return driver.findElement(hpui.productCount);
	}
	public WebElement shoetypetest()
	{
		return driver.findElement(hpui.shoetype);
	}
	public WebElement shoetypecheck()
	{
		return driver.findElement(hpui.shoechecked);
	}
	public WebElement Orderid()
	{
		return driver.findElement(hpui.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(hpui.phno);
	}
	public WebElement TrackOrder()
	{
		return driver.findElement(hpui.track);
	}
	
	public WebElement instaicon()
	{
		return driver.findElement(hpui.insta);
	}
	public WebElement instafollowers()
	{
		return driver.findElement(hpui.follow);
	}
	public WebElement ChatFrame()
	{
		return driver.findElement(hpui.chat);
	}
	public WebElement ClickChatFrame()
	{
		return driver.findElement(hpui.cchat);
	}
	public WebElement ChatWithBot()
	{
		return driver.findElement(hpui.chatwithus);
	}
	public WebElement ChattextBox()
	{
		return driver.findElement(hpui.chattext);
	}
	public WebElement carticon1()
	{
		return driver.findElement(hpui.carticon);
	}
	public WebElement cartcheck1()
	{
		return driver.findElement(hpui.cartcheck);
	}
	
	
	
	
	
	
	
	
}
