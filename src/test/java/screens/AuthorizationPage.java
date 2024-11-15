package screens;


import base.BaseObject;


public class AuthorizationPage extends BaseObject {

    String num2 = "//android.view.View[5]/android.view.View[5]";
    String num5 = "//android.view.View[5]/android.view.View[8]";
    String num8 = "//android.view.View[5]/android.view.View[2]";
    String num9 = "//android.view.View[5]/android.view.View[9]";

    public void setPin(){
        clickKey(num5);
        clickKey(num8);
        clickKey(num2);
        clickKey(num9);
    }
}
