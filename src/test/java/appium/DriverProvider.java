package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverProvider {

    protected AppiumDriver<MobileElement> driver;

    public AppiumDriver<MobileElement> getDriver(String platform) throws MalformedURLException {
        DesiredCapabilities set = new DesiredCapabilities();

        if (driver == null) {
            switch (platform.toLowerCase()) {
                case "android2": {
                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    set.setCapability("appium:appPackage", "enva.t1.mobile");
                    set.setCapability("appium:appActivity", "enva.t1.mobile.MainActivity");
                    set.setCapability(MobileCapabilityType.APP, "/Users/dmitry/Desktop/app-1.8.0-dev-google-debug.apk");
                    set.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_7_Pro");
                    set.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
                    set.setCapability("appium:noReset", "true");
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), set);
                }
                break;
                case "android": {
                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    set.setCapability("platformVersion", "11.0");
                    set.setCapability("deviceName", "SM_A515F");
                    set.setCapability("udid", "R58MC2M54KE");
                    set.setCapability("appPackage", "enva.t1.mobile");
                    set.setCapability("appActivity", "enva.t1.mobile.MainActivity");
                    set.setCapability("noReset", true);
                    set.setCapability("autoGrantPermissions", true);
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), set);
                }
                break;
                default: { throw new IllegalArgumentException("Unsupported platform: " + platform); }
            }
        }
        return driver;
    }
}
