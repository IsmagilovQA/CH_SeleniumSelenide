package common;

public class Config {

    /**
     * Specify the browser and platform for tests:
     * CHROME_MAC
     * FIREFOX_MAC
     */
    public static final String BROWSER_AND_PLATFORM = "CHROME_MAC";

    /**
     * Clear browser cookies after each iteration
     */
    public static final Boolean CLEAR_COOKIES = true;

    /**
     * To keep browser open after all scenario/tests
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}