package common;

import com.codeborne.selenide.Selenide;
import static common.Config.CLEAR_COOKIES;


public class CommonActions {

    public static void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
            Selenide.executeJavaScript("window.sessionStorage.clear()");
        }
    }
}