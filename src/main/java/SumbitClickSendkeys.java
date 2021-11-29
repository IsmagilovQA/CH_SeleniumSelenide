import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumbitClickSendkeys {

    @Test
    public void submitAndClick() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://en-gb.facebook.com/");
        WebElement loginButton = driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
        loginButton.submit();

        WebElement createAccButton = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createAccButton.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.clear();
        emailInput.sendKeys("hi!");

        driver.navigate().to("https://www.file.io/");
        WebElement uploadBtn = driver.findElement(By.id("upload-button"));
         //Send keys can work as uploader as well, not only for sending text.
         //Also, it puts text at the end in case there is some text in the input.
        uploadBtn.sendKeys("/Users/ismagilov/IdeaProjects/CH_SeleniumSelenide/src/main/resources/chromedriver");
    }
}
