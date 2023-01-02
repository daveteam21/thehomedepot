Feature: HomeDepot Add To Cart Functionality
Scenario: Add item to the cart
Given HomeDepot Homepage
When Search for wipe
And Select Clorox wipe
And Select Store Pickup
Then Add to Cart 
And click view cart

