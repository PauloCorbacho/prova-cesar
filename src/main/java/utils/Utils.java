package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import setup.BaseTestes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils {
    protected static WebDriver driver;
    public static final int DEFAULT_WAIT_4_ELEMENT = 10;

    public Utils() {
        driver = BaseTestes.obterDriver();
    }

    public void fecharAba(int indiceAba) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(indiceAba));
        driver.close();
        driver.switchTo().window(tabs.get(1));
    }


    public static boolean isElementDisplayedList(WebDriver driver, List<WebElement> element, int indice, int timeOutInSeconds) {
        try {
            setImplicitWait(driver, timeOutInSeconds);
            boolean isElementDisplayed = element.get(indice).isDisplayed();
            resetImplicitWait(driver);
            return isElementDisplayed;
        } catch (Exception e) {
            return false;
        }
    }

    public static void setImplicitWait(WebDriver driver, int waitTime_InSeconds) {
        driver.manage().timeouts().implicitlyWait(waitTime_InSeconds, TimeUnit.SECONDS);
    }

    public static void resetImplicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_4_ELEMENT, TimeUnit.SECONDS);
    }
}
