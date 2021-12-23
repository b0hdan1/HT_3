package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MonitorsPage extends BasePage {
    public MonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='fltr-1']")
    private WebElement onlyInStockButton;

    @FindBy(xpath = "//a[contains(@href, 'eizo-ev2450-bk-item')]")
    public WebElement selectOneMonitor;

    public void clickOnOnlyInStockButton() {
        Actions action = new Actions(driver);
        action.moveToElement(onlyInStockButton).click().build().perform();
    }

    public void clickOnOneMonitor() {
        selectOneMonitor.click();
    }
}
