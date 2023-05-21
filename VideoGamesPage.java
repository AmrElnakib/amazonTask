public class VideoGamesPage {
    private WebDriver driver;
    private By allVideoGamesLink = By.xpath("//span[contains(text(),'All Video Games')]");
    private By filterMenu = By.id("filters");
    private By freeShippingFilter = By.xpath("//span[contains(text(),'Free Shipping by Amazon')]");
    private By newConditionFilter = By.xpath("//span[contains(text(),'New')]");
    private By sortMenu = By.id("sort");

    public VideoGamesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAllVideoGames() {
        driver.findElement(allVideoGamesLink).click();
    }

    public void addFilters(String... filters) {
        driver.findElement(filterMenu).click();
        // Add the specified filters by clicking on the corresponding elements
    }

    public ProductListingPage sortByPriceHighToLow() {
        driver.findElement(sortMenu).click();
        // Select "Price: High to Low" from the sort menu
        // Return the ProductListingPage object
    }
}