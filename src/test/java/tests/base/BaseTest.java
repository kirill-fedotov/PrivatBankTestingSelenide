package tests.base;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import pages.CarLoansPage;
import pages.BasePage;
import pages.MobilePhoneReplenishmentPage;
import static common.Config.*;

public class BaseTest {

    protected BasePage basePage = new BasePage();
    protected CarLoansPage carLoansPage = new CarLoansPage();
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage();

    @AfterEach
    void clearCookiesAndLocalStorage() {
        clearCookiesAndLocalStorage();
    }

    @AfterAll
    public static void close() {
        if (!HOLD_BROWSER_OPEN) {
            Selenide.closeWebDriver();
        }
    }
}
