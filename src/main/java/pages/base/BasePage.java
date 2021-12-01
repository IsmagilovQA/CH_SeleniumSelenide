package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to specific URL
     * @param url
     */
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Wait for visibility of element in DOM model
     * @param element
     * @return
     */
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /**
     * Checks that auth frame is visible
     */
    public void isAuthWidgetPresent() {
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);


    }
}
