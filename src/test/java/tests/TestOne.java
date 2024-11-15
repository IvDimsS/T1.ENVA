package tests;


import org.testng.annotations.Test;
import screens.AuthorizationPage;


public class TestOne extends AuthorizationPage {

    @Test(groups = "smoke")
    public void passcode() {
        setPin();
    }

   @Test(groups = "smoke")
    public void passcode2() {
        setPin();
    }
}