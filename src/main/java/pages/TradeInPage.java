package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradeInPage extends BasePage {

    public TradeInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='nextBtn']")
    public WebElement forwardButton;

    @FindBy(xpath = "//button[contains(text(), 'Да')]")
    public WebElement deviceTurnOnButton;

    @FindBy(xpath = "//button[@class='main-btn main-btn--tradein btn-tradein-fullwidth-small'][contains(text(), 'Да')]")
    public WebElement allFunctionsWorkButton;

    @FindBy(xpath = "//button[contains(text(), 'Дисплей и корпус не имеет царапин и сколов')]")
    public WebElement caseAndDisplayScratchFreeButton;

    @FindBy(xpath = "//button[contains(text(), 'Полный комплект')]")
    public WebElement fullSetButton;

    @FindBy(xpath = "//input[@data-bind='name']")
    public WebElement inputNameField;

    @FindBy(xpath = "//input[@data-bind='phone']")
    public WebElement inputPhoneField;

    public void clickForwardButton() {
        forwardButton.click();
    }

    public void selectDeviceTurnOn() {
        deviceTurnOnButton.click();
    }

    public void selectAllFunctionsWork() {
        allFunctionsWorkButton.click();
    }

    public void selectCaseAndDisplayScratchFree() {
        caseAndDisplayScratchFreeButton.click();
    }

    public void selectFullSet() {
        fullSetButton.click();
    }

    public void selectInputNameField(final String name) {
        inputNameField.sendKeys(name);
    }

    public void selectInputPhoneField(final String phoneNumber) {
        inputPhoneField.sendKeys(phoneNumber);
    }

}
