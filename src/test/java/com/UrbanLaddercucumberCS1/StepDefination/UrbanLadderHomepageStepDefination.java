package com.UrbanLaddercucumberCS1.StepDefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UrbanLadderCucumberCS.PageObjects.UrbanLadderHomePageObjects;
import com.UrbanLaddercucucmberCS.ResuableComponents.Base;
import com.UrbanLaddercucucmberCS.ResuableComponents.ReusableMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UrbanLadderHomepageStepDefination extends Base{
	
	

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
	}

	@Given("^navigate to given url and close popup$")
	public void navigate_to_given_url_and_close_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
		logger.info("open driver successfully");
		OpenUrl();
		hpgo.ClosingPopup().click();
		logger.info("close popup");
		
	}

	 @When("^we Enter \"([^\"]*)\" in searchbox and search$")
	    public void we_enter_something_in_searchbox_and_search(String strArg1) throws Throwable {
	       
	    
	    // Write code here that turns the phrase above into concrete actions
		UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
		Thread.sleep(5000);
		hpgo.clickingSearchBox().sendKeys(strArg1);
		logger.info("entered keys into searchbox");
		hpgo.clickingSearchButton().click();
	}


@Then("^Check item is present or not$")
public void check_item_is_present_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
		if(hpgo.Checkingitem().isDisplayed()) {
			System.out.println("clicked item is present"+hpgo.Checkingitem());
			logger.info("item is present");
			}
		
			else
			{
				System.out.println("clicked item  is not present");
			}
	}

@When("^click on aboutUs over here$")
public void click_on_aboutus_over_here() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.ClosingPopup().click();
	Thread.sleep(5000);
	hpgo.ClickingAboutUs().click();
	
    
}
@Then("^get the description about urbanladder$")
public void get_the_description_about_urbanladder() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	String s=hpgo.AboutLadderpara().getText();
	System.out.println(s);
	logger.info("about ladder has printed");
	
}

@When("^Enter here1 \"([^\"]*)\" in searchbox and search$")
public void enter_here1_something_in_searchbox_and_search(String strArg1) throws Throwable {
 

	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.clickingSearchBox().sendKeys(strArg1);
	hpgo.clickingSearchBox().sendKeys(Keys.ENTER);
	logger.info("enter keys into searchbox");
}


@Then("^check price of homedecor item$")
public void check_price_of_homedecor_item() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	Thread.sleep(5000);
	System.out.println("price of home decor is  "+hpgo.PriceHomeDecor().getText());
	logger.info("price of homedecor has printed");
}
/*@When("^click on Tv icon navigate to tv display list$")
public void click_on_Tv_icon_navigate_to_tv_display_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePageObjects hpgo= new HomePageObjects(driver);
	Thread.sleep(3000);
	hpgo.clickingtvicon().click();
}
@When("^click on consern tv$")
public void click_on_consern_tv() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePageObjects hpgo= new HomePageObjects(driver);
	hpgo.clickingtv().click();
}
@Then("^get warranty period of tv$")
public void get_warranty_period_of_tv() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePageObjects hpgo= new HomePageObjects(driver);
	System.out.println(hpgo.checkwarranty().getText());*/   
//}

@When("^click on giftcard icon get count of source tags$")
public void click_on_giftcard_icon_get_count_of_source_tags() throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.clickinggiftcards().click();
	int si=driver.findElements(By.tagName("a")).size();
	System.out.println(si);
	logger.info("count of images has printed");
}

@When("^click on rectilinear icon get total stock$")
public void click_on_rectilinear_icon_get_total_stock() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.clickingrect().click();
	System.out.println("All Stocks: "+hpgo.itemscount().getText());
}

@Then("^check the checkbox now get in stock count$")
public void check_the_checkbox_now_get_in_stock_count() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.checkrect().click();
	System.out.println("In Stocks: "+hpgo.itemscount().getText());
    
}


@When("^type again \"([^\"]*)\" in searchbox and search$")
public void type_again_something_in_searchbox_and_search(String strArg1) throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.clickingSearchBox().sendKeys(strArg1);
	hpgo.clickingSearchBox().sendKeys(Keys.ENTER);
}
@When("^click on specified type$")
public void click_on_specified_type() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	Actions action = new Actions(driver);
	  
	  action.moveToElement(hpgo.shoetypetest()).perform();
	  
}

@Then("^click on checkbox$")
public void click_on_checkbox() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	Actions action = new Actions(driver);
	  
	  action.moveToElement(hpgo.shoetypecheck()).click().perform();
	  logger.info("shoe checkbox has clicked");
	  Thread.sleep(5000);
	
	  if(hpgo.shoetypecheck().isSelected())
	  {
		  System.out.println("Checkbox Got selected");
		  
	  } 
}
@When("^click on trackorder$")
public void click_on_trackorder() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.TrackOrder().click();
	logger.info("trackorder clicked");
    
}

@Then("^Enter (.+) and also (.+)$")
public void enter_and_also(String orderid, String phonenumber) throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.Orderid().sendKeys(orderid);
	logger.info("entered order id");
	hpgo.PhoneNumber().sendKeys(phonenumber);
	logger.info("entered phone number");
}



@Then("^click on followers list get count$")
public void click_on_followers_list_get_count() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();
    for(String handle: allWindowHandles)
    {
        if(!handle.equals(mainWindowHandle)) 
        {
        driver.switchTo().window(handle);
        System.out.println("number of followers in instagram "+hpgo.instafollowers().getAttribute("title"));
        }
    }
}
@When("^entered into chat frame and clickon chaticon$")
public void entered_into_chat_frame_and_clickon_chaticon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	Thread.sleep(5000);
	driver.switchTo().frame(hpgo.ChatFrame());
	logger.info("chat frame has entered");
	Thread.sleep(5000);
	hpgo.ClickChatFrame().click();
	logger.info("clicked on chat frame icon");
	Thread.sleep(5000);
}

@When("^choose a chattype$")
public void choose_a_chattype() throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.ChatWithBot().click();
    
}

@Then("^enter query$")
public void enter_query() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.ChattextBox().sendKeys("Hello");
	hpgo.ChattextBox().sendKeys(Keys.ENTER);
	logger.info("query has entered to resolve");
	driver.switchTo().defaultContent();
    
}


@When("^click on the1 carticon here$")
public void click_on_the1_carticon_here() throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	hpgo.carticon1().click();
	logger.info("click on study icon");
	
}

@Then("^check cart is empty or not$")
public void check_cart_is_empty_or_not() throws Throwable {
	UrbanLadderHomePageObjects hpgo= new UrbanLadderHomePageObjects(driver);
	System.out.println(hpgo.cartcheck1().getText());
	logger.info("checked title successfully");
	
}




}
