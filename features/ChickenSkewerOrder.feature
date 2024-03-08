Feature: Order Chicken Skewers from DeliverEasy 
Scenario: Order Chicken Skewers from DeliverEasy 

Given Navigate to the landing page of DeliverEasy
When Enter location as "11 Percy Kinsman Cresent"
And Searching filter apply for restaurents
When Searching the restaurent "Aroy Thai (Upper Hutt)"
Then Searching the dish "Sugarcane Prawns (3pcs)"
When Click on Add to cart button 
And  Click on view cart button
And Click on Checkout button


#Then Add one Margherita to cart 
#When Click on Cart button
#Then Verify Checkout page is loaded correctly


