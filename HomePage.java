public class HomePage {
    private WebDriver driver;
    private By signInButton = By.id("nav-link-accountList");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(signInButton).click();
        // Enter username and password and click login button
    }

    public AllMenuPage clickAllMenu() {
        // Click on the "All" menu and return the AllMenuPage object
    }
}