package base;

import appium.DriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public abstract class BaseObject {

    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;

//    public BaseObject(String platform) throws MalformedURLException {
//        driver = DriverProvider.getDriver(platform);
//        wait = new WebDriverWait(driver, 10);
//    }

    @BeforeMethod(groups = "smoke", alwaysRun = true)
    @Parameters("platform")
    public void setUp(String platform) throws MalformedURLException {
        DriverProvider driverProvider = new DriverProvider(); // Создаем новый экземпляр DriverProvider для каждого теста
        driver = driverProvider.getDriver(platform);
        wait = new WebDriverWait(driver, 10);
    }


    @AfterMethod(groups = "smoke", alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        System.out.println("Текущее значение driver после tearDown: " + driver);
    }


    private void isClickable(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

    }


    public void clickKey(String locator) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).click();
    }


    public void sendKey(String locator) {
        isClickable(locator);
        driver.findElement(By.xpath(locator)).sendKeys();
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



