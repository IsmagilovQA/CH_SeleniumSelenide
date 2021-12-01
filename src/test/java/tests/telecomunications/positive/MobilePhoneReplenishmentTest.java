package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.BankCardTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .typePhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .typeAmount("1")
                .typeCardNumber(MOBILE_PAYMENT_CARD)
                .typeExpireDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .typeCvvCode(MOBILE_PAYMENT_CVV)
                .addToCart();
    }
}
