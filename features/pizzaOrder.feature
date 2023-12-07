Feature: Order Pizza from Swiggy 
Scenario: Order Pizza From Swiggy

Given Navigate to the landing page of Swiggy "https://www.swiggy.com/"
When Enter location as "Mumbai"
And Redirect to the ItemPage
When Hover over search icon
Then Enter Item as Pizza and search
When Search resturant 
And  Select Pizza Hut
And Redirect to orderPage and order Margherita
Then Add one Margherita to cart 
When Click on Cart button
Then Verify Checkout page is loaded correctly


