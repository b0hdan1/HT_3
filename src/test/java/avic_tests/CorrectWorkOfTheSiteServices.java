package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CorrectWorkOfTheSiteServices extends BaseTest {
    private static final String ACTUAL_PHONE_NUMBER = "0-800-307-900";
    private static final String PHONE_NUMBER = "0958472857";
    private static final String NAME = "Николай Басков";

    @Test
    public void checkActualHeaderPhoneNumbers() {
        getHomePage().getFoundElements();
        for(WebElement webElement : getHomePage().getFoundElements()){
            Assert.assertTrue(webElement.getText().contains(ACTUAL_PHONE_NUMBER), "Phone number is not actual!");
        }
    }

    @Test
    public void checkCallBack() {
        getHomePage().clickOnCallBackButton();
        getHomePage().addNumberForCallBack(PHONE_NUMBER);
        getHomePage().clickCallBackToMeButton();
        assertTrue(getDriver().getPageSource().contains("bingc-we-already-call-you"));
    }

    @Test
    public void checkTradeIn() {
        getHomePage().clickOnTradeInButton();
        getTradeInPage().clickForwardButton();
        getTradeInPage().clickForwardButton();
        getTradeInPage().selectDeviceTurnOn();
        getTradeInPage().clickForwardButton();
        getTradeInPage().selectAllFunctionsWork();
        getTradeInPage().clickForwardButton();
        getTradeInPage().selectCaseAndDisplayScratchFree();
        getTradeInPage().clickForwardButton();
        getTradeInPage().selectFullSet();
        getTradeInPage().clickForwardButton();
        getTradeInPage().selectInputNameField(NAME);
        getTradeInPage().selectInputPhoneField(PHONE_NUMBER);
        getTradeInPage().clickForwardButton();
        assertTrue(getDriver().getCurrentUrl().contains("/thankyou?"));
    }
}
