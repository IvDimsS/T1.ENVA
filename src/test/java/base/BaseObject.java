package base;

import appium.DriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Objects;

public abstract class BaseObject {

    String num2i = "//XCUIElementTypeButton[@name=\"2\"]";
    String num2 = "//android.view.View[5]/android.view.View[2]";
    String num5i = "//XCUIElementTypeButton[@name=\"5\"]";
    String num5 = "//android.view.View[5]/android.view.View[5]";
    String num8i = "//XCUIElementTypeButton[@name=\"8\"]";
    String num8 = "//android.view.View[5]/android.view.View[8]";
    String num9i = "//XCUIElementTypeButton[@name=\"9\"]";
    String num9 = "//android.view.View[5]/android.view.View[9]";

    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;

    @BeforeMethod(groups = "smoke", alwaysRun = true)
    @Parameters("platform")
    public void setUp(String platform) throws MalformedURLException {
        DriverProvider driverProvider = new DriverProvider();
        driver = driverProvider.getDriver(platform);
        wait = new WebDriverWait(driver, 30);
        if (Objects.equals(platform, "ios")) {
            installPini(); // Вызов метода для iOS
        } else if (Objects.equals(platform, "android")) {
            installPin(); // Вызов метода для Android
        }
    }

    @AfterMethod(groups = "smoke", alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
//            driver.terminateApp("enva.t1.mobile");
            driver.quit();
        }
    }

    public void isClickable(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

    }

    public void click(String locator) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).click();
    }

    public void send(String locator, String text) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public void textAssert(String expected, String actual) {
        Assert.assertEquals(expected, actual, "Text not found");
    }

    private void installPin(){
        click(num5);
        click(num8);
        click(num2);
        click(num9);
    }
    private void installPini(){
        click(num5i);
        click(num8i);
        click(num2i);
        click(num9i);
    }

    public void swipeScreen(int startX, int startY, int endX, int endY) {
        TouchAction action = new TouchAction(driver);
        action
                .press(PointOption.point(startX, startY)) // Начальная точка
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // Время ожидания
                .moveTo(PointOption.point(endX, endY)) // Конечная точка
                .release() // Отпускание
                .perform(); // Выполнение действия
    }


}



