import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import java.util.Set;

public class BrowserSizeAndLogs {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1000, 1000));
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        Dimension getSize = driver.manage().window().getSize();
        System.out.println(getSize);

        Point position = driver.manage().window().getPosition();
        System.out.println(position);

        driver.manage().window().setPosition(new Point(30, 50));

        // Log types: [browser, driver, client]
        // browser logs -> getting errors from console
        Set<String> availableLogTypes = driver.manage().logs().getAvailableLogTypes();
        System.out.println(availableLogTypes);

        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logs)
        System.out.println(entry);
    }
}
