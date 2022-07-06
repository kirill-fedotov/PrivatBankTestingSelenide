package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CarLoansPage {

    private final SelenideElement tabAgreements = $x("//div[@class='item_ryTYvf_Qfl']");

    /**
     * Check is auth frame is visible
     */
    public CarLoansPage selectAgreementsTab() {
        tabAgreements.shouldBe(Condition.visible).click();
        return this;
    }
}
