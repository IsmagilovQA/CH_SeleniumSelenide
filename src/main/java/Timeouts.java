import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Timeouts {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);



        WebElement loginButton = driver.findElement(By.xpath("//*[@data-qa-node='login']"));
        WebElement loginButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-qa-node='login']")));
        loginButton.click();
        driver.quit();

        //Неявные - implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Явные ожидания - explicitly wait
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
    }

    // Checking the presence of element
    public boolean isElementPresent(WebDriver driver, By locator) {
        return driver.findElements(locator).size() > 0;
    }

    // Checking the absence of element
    public boolean isElementAbsence(WebDriver driver, By locator) {
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return driver.findElements(locator).size() == 0;
        } finally {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}
