package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-top__item']/a[contains(text(),'0-800-307-900')]")
    private List<WebElement> foundElements;

    @FindBy(xpath = "//a[contains(@href, 'elektronika')][contains(@class, 'sidebar-item')]")
    private WebElement computersButton;

    @FindBy(xpath = "//a[contains(@href, 'monitoryi')][contains(@class, 'image-brand')]")
    private WebElement selectMonitorsButton;

    @FindBy(xpath = "//a[@id='bingc-phone-button']")
    private WebElement callBackButton;

    @FindBy(xpath = "//input[@id='bingc-passive-get-phone-form-input']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//a[@id='bingc-passive-phone-form-button']")
    private WebElement callBackToMeButton;

    @FindBy(xpath = "//a[contains(@href,  '/tradein')][@class='header-top__item']")
    private WebElement tradeInButton;

    public List<WebElement> getFoundElements() {
        return foundElements;
    }

    public void clickOnComputersButton() {
        computersButton.click();
    }

    public void clickOnSelectMonitorsButton() {
        selectMonitorsButton.click();
    }

    public void clickOnCallBackButton() {
        callBackButton.click();
    }

    public void addNumberForCallBack(final String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void clickCallBackToMeButton() {
        callBackToMeButton.click();
    }

    public void clickOnTradeInButton() {
        tradeInButton.click();
    }
}
