package constants;

public class Constant {

    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls {
        public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile";
        public static final String CAR_LOANS_URL = "https://next.privat24.ua/auto-credit/order";
    }

    public static class BankCardTestData {
        public static final String MOBILE_PAYMENT_CARD = "4506909324274797",
                                MOBILE_PAYMENT_CARD_EXP_DATE = "06/22",
                                MOBILE_PAYMENT_CVV = "327",
                                MOBILE_PAYMENT_PHONE_NUMBER = "686979712";
    }
}
