import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttributes {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://next.privat24.ua/");

        WebElement loginBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-qa-node='login']")));
        String textContentAtr = loginBtn.getAttribute("textContent");
        System.out.println(textContentAtr);
        Assert.assertEquals("Вхід", textContentAtr);

        driver.navigate().to("https://next.privat24.ua/mobile");
        WebElement amount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-qa-node='amount']")));
        String defaultValue = amount.getAttribute("defaultValue");
        System.out.println(defaultValue);
        Assert.assertEquals(defaultValue, "50");
        driver.quit();
    }

}
