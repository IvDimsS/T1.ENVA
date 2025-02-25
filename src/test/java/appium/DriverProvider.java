package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.ios.IOSDriver;
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
                case "android": {
                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    set.setCapability("appium:appPackage", "enva.t1.mobile");
                    set.setCapability("appium:appActivity", "enva.t1.mobile.MainActivity");
                    set.setCapability(MobileCapabilityType.APP, "/Users/dmitry/Desktop/app-1.11.0-dev-google-debug.apk");
                    set.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_7_Pro");
                    set.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
                    set.setCapability("appium:noReset", "true");
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), set);
                }
                break;
                case "ios2": {
                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//                    set.setCapability("appium:appPackage", "enva.t1.mobile");
                    set.setCapability(MobileCapabilityType.APP, "/Users/dmitry/Library/Developer/Xcode/DerivedData/ENVA-clvrayqluasexpbefnluuvnacqdf/Build/Products/Debug-iphonesimulator/ENVA.app");
                    set.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 16");
                    set.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    set.setCapability(MobileCapabilityType.PLATFORM_VERSION, "18.2");
                    set.setCapability("udid", "A706202B-79C5-4602-97DE-C55A0F9E801B");
                    set.setCapability("appium:noReset", "true");
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:8100/wd/hub"), set);
                }
                break;
                case "android2": {
                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    set.setCapability("platformVersion", "11.0");
                    set.setCapability("deviceName", "SM_A515F");
                    set.setCapability("udid", "R58MC2M54KE");
                    set.setCapability("appPackage", "enva.t1.mobile");
                    set.setCapability("appActivity", "enva.t1.mobile.MainActivity");
                    set.setCapability("noReset", true);
                    set.setCapability("autoGrantPermissions", true);
                    driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), set);
                }
                break;
                case "ios": {
//                    set.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                    set.setCapability("platformName", "iOS");
                    set.setCapability("platformVersion", "18.2");
//                    set.setCapability("automationName", "XCUITest");
                    set.setCapability("deviceName", "iPhone 16 Pro Max");
                    set.setCapability("udid", "B5FC9EA0-BDB1-450B-BE79-7E0129D551F6");
                    set.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    set.setCapability("bundleId", "enva.t1.mobile");
//                    set.setCapability("appActivity", "enva.t1.mobile.MainActivity");
                    //B5FC9EA0-BDB1-450B-BE79-7E0129D551F6 16 Pro max
                    //F4B8DB3E-38CD-441A-92A0-C2651675B535 16
                    set.setCapability(MobileCapabilityType.APP, "/Users/dmitry/Library/Developer/Xcode/DerivedData/ENVA-clvrayqluasexpbefnluuvnacqdf/Build/Products/Debug-iphonesimulator/ENVA.app");
                    set.setCapability("noReset", true);
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), set);
                    if (driver.queryAppState("enva.t1.mobile") == ApplicationState.NOT_INSTALLED) {
                        driver.terminateApp("enva.t1.mobile");
                    }
                }
                break;
                default: { throw new IllegalArgumentException("Unsupported platform: " + platform); }
            }
        }
        return driver;
    }
}
