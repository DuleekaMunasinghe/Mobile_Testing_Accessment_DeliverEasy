
#Sample Feature Definition Template
Feature: Add feature description here - Order Pizza from Swiggy 
Scenario: Order Pizza From Swiggy

Given Navigate to the landing page of Swiggy "https://www.swiggy.com/"
When Enter location as "<city>"
When Redirect to the ItemPage
When Hover over search icon
Then Enter Item as Pizza and search
When Search resturant and select Pizza Hut
And Redirect to orderPage and order Margherita
Then Add one Margherita to cart 
When Click on Cart button
Then Verify Checkout page is loaded correctly
#When Enter Item as "Pizza"
#When Select first suggested Item in pizza cateogory
#When Search resturant and select first restaurant
#When Redirect to orderPage 
#When Add first item to cart 
#When Click on checkout button
#Then Order a pizza suscessfully 

Examples: 
|city|
|Mumbai|
#|Chennai|

