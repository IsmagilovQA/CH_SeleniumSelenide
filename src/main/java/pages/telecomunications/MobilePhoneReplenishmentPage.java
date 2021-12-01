package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import javax.management.StringValueExp;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By walletBtn = By.xpath("//div[@data-qa-node='debitSourceSource']"),
                    cardNumberInput = By.xpath("//input[@data-qa-node='numberdebitSource']"),
                    expireDateInput = By.xpath("//input[@data-qa-node='expiredebitSource']"),
                    cvvCodeInput = By.xpath("//input[@data-qa-node='cvvdebitSource']"),
                    amountInput = By.xpath("//input[@data-qa-node='amount']"),
                    addToCartBtn = By.xpath("//button[@data-qa-node='submit']"),
                    phoneNumberInput = By.xpath("//input[@data-qa-node='phone-number']");


    /**
     * Clicking on Wallet link
     * @return
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(walletBtn).click();
        return this;
    }

    /**
     * Typing bank card number
     * @param cardNumber bank card number
     * @return
     */
    public MobilePhoneReplenishmentPage typeCardNumber(String cardNumber) {
        driver.findElement(cardNumberInput).sendKeys(cardNumber);
        return this;
    }

    /**
     * Typing expired date for a card
     * @param expDate expired date
     * @return
     */
    public MobilePhoneReplenishmentPage typeExpireDate(String expDate) {
        driver.findElement(expireDateInput).sendKeys(expDate);
        return this;
    }

    /**
     * Type CVV secret code
     * @param code CVV code
     * @return
     */
    public MobilePhoneReplenishmentPage typeCvvCode(String code) {
        driver.findElement(cvvCodeInput).sendKeys(code);
        return this;
    }

    /**
     * Type Amount of money
     * @param amount
     * @return
     */
    public MobilePhoneReplenishmentPage typeAmount(String amount) {
        driver.findElement(amountInput).sendKeys(amount);
        return this;
    }

    /**
     * Type mobile phone number excluding country code
     * @param phoneNumber mobile phone
     * @return
     */
    public MobilePhoneReplenishmentPage typePhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
        return this;
    }

    /**
     * Clicking Add to Cart button to submit
     */
    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }
}
