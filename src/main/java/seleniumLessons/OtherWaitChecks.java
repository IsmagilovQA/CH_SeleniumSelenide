package seleniumLessons;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtherWaitChecks {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement buttonRefresh = driver.findElement(By.id("id"));

        wait.until(ExpectedConditions.titleIs("title here"));
        wait.until(ExpectedConditions.urlContains("card/money"));
        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.attributeContains(By.xpath("//*[@test='test']"), "class", "visible"));
        wait.until(ExpectedConditions.textToBePresentInElement(buttonRefresh, "refresh"));
        wait.until(ExpectedConditions.elementToBeClickable(buttonRefresh));

    }
}
