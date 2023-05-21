# amazonProject
Use Selenium-Java with POM &amp; Cucumber to automate scenario on Amazon

First, let's define the page objects for the different pages involved in this scenario. We'll have the following page objects:

HomePage: This page will represent the home page of Amazon. It will have methods to login to the website.

AllMenuPage: This page will represent the page that appears when we click on "All" menu from the left side. It will have methods to navigate to the "Video Games" page.

VideoGamesPage: This page will represent the page that appears when we select "Video Games" from the "All" menu. It will have methods to select "All Video Games" and apply filters.

ProductListingPage: This page will represent the page that appears when we apply filters to the "Video Games" page. It will have methods to sort products by price and add products below a certain price to the cart.

CartPage: This page will represent the page where we can view the items in the cart and proceed to checkout. It will have methods to add address and choose payment method.

