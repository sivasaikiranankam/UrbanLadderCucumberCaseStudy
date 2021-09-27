package com.UrbanLaddercucumberCS1.UiStore;

import org.openqa.selenium.By;

public class UrbanLadderHomePageUi {
	public By clicksearchBox=By.id("search");
	public By clicksearchButton=By.id("search_button");
	public By closingpopup=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	public By BedCheck1=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img");
	
	public By aboutus=By.xpath("//*[@id=\"footer-links\"]/div[1]/div[1]/ul[1]/li[1]/a");
	public By aboutladder=By.xpath("//*[@id=\"page_content\"]/div[1]/div/p[2]");
public By homedecor=By.xpath("//*[@id=\"best_seller_items\"]/div[2]/ul/div/div/li[2]/ul/li[1]/div/div");
/*public By tvicon=By.cssSelector("//*[@id=\"content\"]/div[3]/div/div[2]/a[4]/svg/path[1]");
public By tvclick=By.cssSelector("[title=\"Bayern TV Unit (Columbian Walnut Finish)\"]");
public By warranty=By.xpath("//*[@id=\"cart-form\"]/div[3]/div/div[2]/span[1]/span/b");*/
public By giftcardicon=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
public By rectilinearicon=By.cssSelector("a[href=\"https://www.urbanladder.com/recliners?src=explore_categories\"]");
public By iconrectclick=By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]");
public By productCount=By.cssSelector("[class=\"results-count\"]");
public By shoetype=By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[4]/div[1]");
public By shoechecked=By.xpath("//*[@id=\"filters_primary_finishes_matte\"]");
public By orderid=By.name("orderNumber");
public By phno=By.name("phoneNumber");
public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");

public By insta=By.className("icofont-social-instagram");
public By follow=By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/ul/li[2]/a/span");
public By chat=By.id("fc_widget");
public By cchat=By.className("icon-ic_chat_icon");
public By chatwithus=By.className("channel-name");
public By chattext=By.id("app-conversation-editor");
public By visitus=By.cssSelector("#footer-links > div:nth-child(1) > div.col-md-4.links > ul:nth-child(3) > li:nth-child(2) > a");
public By visitshop=By.cssSelector("[src=\"https://www.ulcdn.net/media/furniture-stores/pune/hadapsar/hadapsar.jpg?1568614617\"]");
public By addressstore=By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/address/div[1]");

public By carticon=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(3) > svg");
public By cartcheck=By.xpath("//*[@id=\"content\"]/div[1]/div/h1");





}
