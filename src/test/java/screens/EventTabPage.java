package screens;


import base.BaseObject;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;


public class EventTabPage extends BaseObject {

    String eventTab = "//android.widget.FrameLayout[@content-desc=\"Лента\"]/android.view.ViewGroup/android.widget.TextView";

    public void eventTabClick(){
        clickKey(eventTab);
    }
}
