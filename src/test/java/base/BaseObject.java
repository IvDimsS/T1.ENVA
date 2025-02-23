package base;

import appium.DriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public abstract class BaseObject {

    String num2 = "//android.view.View[5]/android.view.View[2]";
    String num5 = "//android.view.View[5]/android.view.View[5]";
    String num8 = "//android.view.View[5]/android.view.View[8]";
    String num9 = "//android.view.View[5]/android.view.View[9]";

    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;

    @BeforeMethod(groups = "smoke", alwaysRun = true)
    @Parameters("platform")
    public void setUp(String platform) throws MalformedURLException {
        DriverProvider driverProvider = new DriverProvider();
        driver = driverProvider.getDriver(platform);
        wait = new WebDriverWait(driver, 30);
        installPin();
    }

    @AfterMethod(groups = "smoke", alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void isClickable(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

    }

    public void clickKey(String locator) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).click();
    }

    public void sendKey(String locator, String text) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public void textAssert(String expected, String actual) {
        Assert.assertEquals(expected, actual, "Text not found");
    }

    private void installPin(){
        clickKey(num5);
        clickKey(num8);
        clickKey(num2);
        clickKey(num9);
    }

//    public void swipeScreen(int startX, int startY, int endX, int endY) {
//        TouchAction action = new TouchAction(driver);
//        action
//                .press(PointOption.point(startX, startY)) // Начальная точка
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // Время ожидания
//                .moveTo(PointOption.point(endX, endY)) // Конечная точка
//                .release() // Отпускание
//                .perform(); // Выполнение действия
//    }


}



