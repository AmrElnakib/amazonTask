public class AllMenuPage {
    private WebDriver driver;
    private By videoGamesLink = By.xpath("//span[contains(text(),'Video Games')]");

    public AllMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public VideoGamesPage selectVideoGames() {
        driver.findElement(videoGamesLink).click();
        // Return the VideoGamesPage object
    }
}