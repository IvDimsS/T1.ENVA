package screens;


import base.BaseObject;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class EventPage extends BaseObject {

    String servicesTab = "//android.widget.FrameLayout[@content-desc=\"Лента\"]/android.view.ViewGroup/android.widget.TextView";
    String eventServicesTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
    String eventWidget = "";
    String eventWidgetCart = "";
    String eventCalendarButton = "";
    String eventNotificationButton = "mm";
    String eventConnectButton = "jhkjhk";
    String text;

    @Step("Открытие Событий на экране Сервисов")
    public void eventTabClick(){
        click(servicesTab);
        click(eventServicesTab);
    }

    @Step("Тап на виджет Событий")
    public void eventWidgetClick() {
        Allure.step("Клик на " + eventWidget);
        click(eventWidget);
    }

    @Step("Карточку виджета Событий")
    public void eventWidgetCartClick() {
        click(eventWidgetCart);
    }

    @Step("Кнопка календаря")
    public void eventCalendarClick () {
        click(eventCalendarButton);
    }

    @Step("Кнопка напоминания")
    public void eventNotificationButtonClick () {
        click(eventNotificationButton);
    }

    @Step("Кнопка Присоединиться")
    public void eventConnectButtonClick() {
        click(eventConnectButton);
    }

    @Step("Ожидаемый результат")
    public void eventCompareText() {
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView[1]")).getText();
        String eventActualText = "События";
        textAssert(text,eventActualText);
    }




}
