public class CartPage {
    private WebDriver driver;
    private By proceedToCheckoutButton = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    private By addressField = By.id("address-input");
    private By paymentMethodField = By.id("payment-method-input");
    private By totalAmount = By.id("total-amount");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckoutButton).click();
    }

    public void addAddressAndChoosePaymentMethod(String address, String paymentMethod) {
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(paymentMethodField).sendKeys(paymentMethod);
    }

    public double getExpectedTotalAmount() {
        // Calculate the expected total amount based on the prices of the products and the shipping fees
        // Return the expected total amount as a double
    }

    public double getActualTotalAmount() {
        String totalAmountText = driver.findElement(totalAmount).getText();
        // Extract the actual total amount from the totalAmountText string and return it as a double
    }
}