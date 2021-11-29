import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden");

        driver.switchTo().frame("frame_Example");

        WebElement buttonOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okButton']")));
        buttonOk.click();

        WebElement finalBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='awesome']/h1")));

        Assert.assertEquals("Thanks!", finalBlock.getText());

    }
}
