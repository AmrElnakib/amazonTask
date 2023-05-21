public class AmazonStepDefinitions {
    
    private WebDriver driver;
    private HomePage homePage;
    private AllMenuPage allMenuPage;
    private VideoGamesPage videoGamesPage;
    private ProductListingPage productListingPage;
    private CartPage cartPage;

    @Given("I am on the Amazon Egypt homepage")
public void navigateToHomePage() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.eg/");
    homePage = new HomePage(driver);
}

@When("I login to Amazon Egypt")
public void loginToAmazon() {
    homePage.login("your_username", "your_password");
}

@When("I open the \"All\" menu from the left side")
public void openAllMenu() {
    allMenuPage =homePage.clickAllMenu();
}

@When("I select \"Video Games\" from the menu")
public void selectVideoGamesFromMenu() {
    videoGamesPage = allMenuPage.selectVideoGames();
}

@When("I choose \"All Video Games\"")
public void selectAllVideoGames() {
    videoGamesPage.selectAllVideoGames();
}

@When("I add the filter \"Free Shipping\" and \"New\"")
public void addFilters() {
    videoGamesPage.addFilters("Free Shipping", "New");
}

@When("I sort products by price: high to low")
public void sortProductsByPriceHighToLow() {
    productListingPage = videoGamesPage.sortByPriceHighToLow();
}

@When("I add all products below 15k EGP to cart")
public void addProductsBelow15kEGPToCart() {
    cartPage = productListingPage.addProductsBelowPriceToCart(15000);
}

@When("I proceed to checkout")
public void proceedToCheckout() {
    cartPage.proceedToCheckout();
}

@When("I add the address and choose cash as payment method")
public void addAddressAndChoosePaymentMethod() {
    cartPage.addAddressAndChoosePaymentMethod("your_address", "Cash");
}

@Then("I verify that the total amount is correct with shipping fees")
public void verifyTotalAmount() {
    double expectedTotalAmount = cartPage.getExpectedTotalAmount();
    double actualTotalAmount = cartPage.getActualTotalAmount();
    assertEquals(expectedTotalAmount, actualTotalAmount, 0.01);
    driver.quit();
}