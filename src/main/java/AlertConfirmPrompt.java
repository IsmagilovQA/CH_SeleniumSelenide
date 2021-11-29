import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConfirmPrompt {

    @Test
    public void test() {
        // [Alert. Confirm, Prompt] -> are modals, that blocks UI
        //wait.until(ExpectedConditions.alertIsPresent());
    }

    // Catch alert exception
//    protected void safeAlert() {
//        try {
//            driver.switchTo().alert().dismiss();
//        } catch (NoAlertPresentException e) {
//            System.out.println("exception" + e);
//        }
//    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.navigate().to("https://javascript.info/alert-prompt-confirm");

        // Work with Alerts
        WebElement alertRun = driver.findElement(By.xpath("(//a[@data-action='run'])[1]"));
        alertRun.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        alertRun.click();
        System.out.println(alert.getText());
        alert.accept();

        // Work with Confirm
        WebElement confirmRun = driver.findElement(By.xpath("(//a[@data-action='run'])[5]"));
        confirmRun.click();

        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();

        // Work with prompt
        WebElement promptRun = driver.findElement(By.xpath("(//a[@data-action='run'])[2]"));
        promptRun.click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("333");
        prompt.accept();
        System.out.println(prompt.getText());
        prompt.accept();




    }
}
