import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStates {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebElement el = driver.findElement(By.id("id"));
        el.isDisplayed();
        el.isEnabled();
        el.isSelected();
    }
}
