package common;

import com.codeborne.selenide.Configuration;

public class Config {
    /**
     * Specify the browser and platform for test:
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     */
    public static final String BROWSER_NAME = "chrome"; //firefox, edge, opera

    /**
     * Clean browser cookies after each iteration
     */
    public static final Boolean CLEAR_COOKIES = true;

    /**
     * To keep the browser open after all scenario/tests
     */
    public static final Boolean HOLD_BROWSER_OPEN = false;


    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.browser = BROWSER_NAME;
    }



}
