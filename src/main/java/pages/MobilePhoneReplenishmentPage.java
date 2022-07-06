package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePage {

    private final SelenideElement buttonWallet = $x("//div[contains(text(),'My wallet')]");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement inputFirstName = $x("//input[@placeholder='TARAS']");
    private final SelenideElement inputLastName = $x("//input[@placeholder='SHEVCHENKO']");
    private final SelenideElement buttonSubmitToTheCard = $x("//button[@data-qa-node='submit']");
    private final SelenideElement paymentDetails = $x("//div[@data-qa-node='details']");

    /**
     * Choose a card from the wallet
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     * @param number phone number
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        clearAndType(inputPhoneNumber, number);
        return this;
    }

    /**
     * Enter top-up amount
     * @param amount amount
     */
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        clearAndType(inputAmount, amount);
        return this;
    }

    /**
     * Enter card number for payment
     * @param card card number
     */
    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        clearAndType(inputCardFrom, card);
        return this;
    }

    /**
     * Enter card exp date
     * @param expDate exp date
     */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        clearAndType(inputCardExpDate, expDate);
        return this;
    }

    /**
     * Enter card cvv
     * @param Cvv card cvv
     */
    public MobilePhoneReplenishmentPage enterCardCvv(String Cvv) {
        clearAndType(inputCardCvv, Cvv);
        return this;
    }

    /**
     * Enter card holders First Name
     * @param FirstName First Name
     */
    public MobilePhoneReplenishmentPage enterFirstName(String FirstName) {
        clearAndType(inputFirstName, FirstName);
        return this;
    }

    /**
     * Enter card holders Last Name
     * @param LastName Last Name
     */
    public MobilePhoneReplenishmentPage enterLastName(String LastName) {
        clearAndType(inputLastName, LastName);
        return this;
    }

    /**
     * Enter submit button
     */
    public MobilePhoneReplenishmentPage enterButtonSubmitToTheCard() {
        buttonSubmitToTheCard.click();
        return this;
    }

    /**
     * Check payment details is present in the card
     * @param text expected text
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCard(String text) {
        checkMessage(text);
        return this;
    }

}