package screens;

import base.BaseObject;

public class ContactsPage extends BaseObject {
    String servicesTab = "//android.widget.FrameLayout[@content-desc=\"Лента\"]/android.view.ViewGroup/android.widget.TextView";
    String eventServicesTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
    String eventWidget = "";
    String eventWidgetCart = "nn";
    String eventCalendarButton = "";
    String eventNotificationButton = "";
    String eventConnectButton = "";


    public void asd() {
        clickKey(servicesTab);
    }
}
