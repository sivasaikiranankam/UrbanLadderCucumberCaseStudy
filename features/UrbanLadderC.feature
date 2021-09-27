Feature: Open the UrbanLadder Website  

Scenario: Check item in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When we Enter "bookshelf" in searchbox and search
Then Check item is present or not

Scenario: check about urbanladder
Given Open Browser
And navigate to given url and close popup
When click on aboutUs over here
Then get the description about urbanladder
 
Scenario: get price of homedecor item
Given Open Browser
And navigate to given url and close popup
When Enter here1 "homedecor" in searchbox and search
Then check price of homedecor item


Scenario: get source links count
Given Open Browser
And navigate to given url and close popup
When click on giftcard icon get count of source tags

Scenario: get product count in and out of stock
Given Open Browser
And navigate to given url and close popup
When click on rectilinear icon get total stock
Then check the checkbox now get in stock count

Scenario: get specified product features
Given Open Browser
And navigate to given url and close popup
When type again "shoe" in searchbox and search
And click on specified type 
Then click on checkbox

Scenario Outline: getting order id and phone number 
Given Open Browser
And navigate to given url and close popup
When click on trackorder
Then Enter <orderid> and also <phonenumber>

Examples:
|orderid|phonenumber|
|hgf4567|98541247|
|fkjdh4567|98521478|

Scenario: getting followers count in instagram
Given Open Browser
And navigate to given url and close popup
Then click on followers list get count

Scenario: sending chat
Given Open Browser
And navigate to given url and close popup
When entered into chat frame and clickon chaticon
And choose a chattype
Then enter query

Scenario: checking the cart
Given Open Browser
And navigate to given url and close popup
When click on the1 carticon here
Then check cart is empty or not


















