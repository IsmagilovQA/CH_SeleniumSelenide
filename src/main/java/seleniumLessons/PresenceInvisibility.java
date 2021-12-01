package seleniumLessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresenceInvisibility {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("https://next.privat24.ua/");
        WebElement currencyLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("rates_2g6teezjyl")));
        currencyLink.click();
        WebElement exchangeButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[@data-qa-node='exchange']")));
        exchangeButton.click();
        Assertions.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//button[@data-qa-node='exchange']"))));

    }
}
