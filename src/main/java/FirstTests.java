import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class FirstTests {

    @Test
    public void googleTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");

        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        // Almost the same as get() but with different options
        //driver.navigate().to("http://google.com/");

        /**
         * Switching between window tabs:
        // Saving window id to Set
        Set<String> oldWindow = driver.getWindowHandles();
        System.out.println("oldWindow" + oldWindow);

        // Create new window via js
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switching to new window tab with index 1
        driver.switchTo().window(tabs.get(1));
        driver.get("https://selenium.dev/");

        // Saving new set with window ids
        Set<String> newWindow = driver.getWindowHandles();
        System.out.println("newWindow" + newWindow);
         */

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        driver.quit();
    }
}
