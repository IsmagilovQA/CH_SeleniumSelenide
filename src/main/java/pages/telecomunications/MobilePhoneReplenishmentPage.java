package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By walletBtn = By.xpath("//div[@data-qa-node='debitSourceSource']");

    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(walletBtn).click();
        return this;
    }

}
