import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WorkWithCookie {

    @Test
    public void cookie() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com/IsmagilovQA");
        //Set cookie
        Cookie cookie = new Cookie("user_session", "nAxRD1MDpB13MNvw3ydZzOBz1x46bOZZudvnDp3GZJc4t0Ho");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        //Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);

        //Get cookie by name
        Cookie tz = driver.manage().getCookieNamed("tz");
        System.out.println(tz);

        //Delete cookie by name
        driver.manage().deleteCookieNamed("tz");

        //Delete all cookies
        driver.manage().deleteAllCookies();

        driver.quit();
    }
}
