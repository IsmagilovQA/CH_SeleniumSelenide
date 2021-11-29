import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // iFrames
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("frameName");
//        driver.switchTo().frame(webElement);

        // Navigating deep frame in frame
//        driver.switchTo().frame("main_fraim").switchTo().frame(0).switchTo().frame("sub_frame");
        // Or
//        driver.switchTo().frame("main_frame.0.sub_frame");

        // Switching back to main context 2 options:
//        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame() // works not good

        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locatorOrFrame));


        // Example
//        driver.get("https://next.privat24.ua/");
//
//        WebElement loginBtn = wait.until(ExpectedConditions
//                .presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
//        loginBtn.click();
//        WebElement authFrame = wait.until(ExpectedConditions
//                .presenceOfElementLocated(By.xpath("//iframe[@src='https://login-widget.privat24.ua/']")));
//        driver.switchTo().frame(authFrame);
//         WebElement continueBtn = wait.until(ExpectedConditions
//                 .presenceOfElementLocated(By.xpath("//button[@type='submit' and contains(text(), 'Далі')]")));
//         continueBtn.click();
//
//        wait.until(ExpectedConditions
//                .visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Введено некоректні значення')]")));

        // Example 2
        driver.get("https://jsbin.com/kubugetewa/edit?html,output");

        WebElement mainFrame = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//iframe[@class='stretch']")));
        driver.switchTo().frame(mainFrame);

        WebElement childFrame = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//iframe[@name='JS Bin Output ']")));
        driver.switchTo().frame(childFrame);


        WebElement input = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("seleniumid")));
        input.sendKeys("77");
    }
}
