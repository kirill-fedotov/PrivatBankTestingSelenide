package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public final SelenideElement authWidget = $x("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to specific URL
     */
    public void goToUrl(String url) {
        open(url);
    }

    /**
     * A method that cleans the element of the text and enters the desired text
     * @param element Selenium WebElement
     * @param value text
     */
    protected void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    /**
     * Checking whether a frame for authorization
     */
    public void isOutWidgetPresent() {
        authWidget.shouldBe(Condition.visible);
    }

    public void checkMessage(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }
}
