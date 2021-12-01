package common;

public class Config {
    /**
     * Config to specify the browser and platform for tests.
     * Webdriver logic you can find in CommonActions.class.
     *
     * Available the following options:
     * CHROME_MAC
     * FIREFOX_MAC
     */
    public static final String BROWSER_AND_PLATFORM = "CHROME_MAC";

    /** Config to clear browser cookies after each iteration */
    public static final Boolean CLEAR_COOKIES = true;

    /** Config to keep browser open after all scenario/tests */
    public static final Boolean HOLD_BROWSER_OPEN = false;

    /** Config to clear the 'build/reports/tests' dir with screenshots before starting the build */
    public static final Boolean CLEAR_REPORTS_DIR = true;
}