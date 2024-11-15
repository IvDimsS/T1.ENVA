package tests;


import org.testng.annotations.Test;
import screens.AuthorizationPage;


public class TestTwo extends AuthorizationPage {

    @Test(groups = "smoke")
    public void passcode3() {
        setPin();
    }
}