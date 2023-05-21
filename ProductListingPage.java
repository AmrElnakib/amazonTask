public class ProductListingPage {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//span[contains(text(),'Add to Cart')]");
    private By cartButton = By.id("nav-cart");

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addProductsBelowPriceToCart(double price) {
        // Find all products below the specified price and click on the "Add to Cart" button for each product
        // Click on the "Cart" button to go to the CartPage
        // Return the CartPage object
    }
}