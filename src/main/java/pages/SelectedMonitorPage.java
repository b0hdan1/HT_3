package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedMonitorPage extends BasePage{
    public SelectedMonitorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(), 'Купить в рассрочку')]")
    private WebElement buyInInstallmentsButton;

    @FindBy(xpath = "//span[contains(text(), 'Колібрі')]")
    private WebElement oneOfTheBankButton;

    public void clickOnBuyInInstallmentsButton() {
        buyInInstallmentsButton.click();
    }

    public void clickOnOneOfTheBankButton() {
        oneOfTheBankButton.click();
    }
}
