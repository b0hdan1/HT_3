package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {

    private String SELECTED_BANK = "#js_myCredit";

    @Test
    public void checkInstallmentPayment() {
        getHomePage().clickOnComputersButton();
        getHomePage().implicitWait(10);
        getHomePage().clickOnSelectMonitorsButton();
        getMonitorsPage().clickOnOnlyInStockButton();
        getMonitorsPage().clickOnOneMonitor();
        getSelectedMonitorPage().clickOnBuyInInstallmentsButton();
        getSelectedMonitorPage().clickOnOneOfTheBankButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(SELECTED_BANK));
    }
}
