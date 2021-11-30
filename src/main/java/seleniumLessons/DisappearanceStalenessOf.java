package seleniumLessons;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisappearanceStalenessOf {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://next.privat24.ua/money-transfer/card");

        WebElement addCommentLink = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//span[@data-qa-node='toggle-comment']")));
        addCommentLink.click();

        WebElement commentTexArea = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//textarea[@data-qa-node='comment']")));

        WebElement closeBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Close']")));
        closeBtn.click();

        Assert.assertTrue(wait.until(ExpectedConditions.stalenessOf(commentTexArea)));
    }
}
