package screens;

import base.BaseObject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseObject {
    //Android locators
    String widgetInbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]";
    String searchField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText";
    String findTest = "Лисин Дмитрий";
    String employCart = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]";
    String text;

    @Step("Нажать на виджет Мои задачи")
    public void widgetInboxClick() {
        click(widgetInbox);
    }

    @Step("Нажать кнопку Поиск на таббаре")
    public void searchFieldClick() {
        click(searchField);
    }

    @Step("Ввести в после текст")
    public void setTest () {
        send(searchField, findTest);
    }

    public void employCartClick() {
        click(employCart);
        try {
            Thread.sleep(5000); // 5 секунд
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Восстанавливаем флаг прерывания
            e.printStackTrace();
        }
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[1]")).getText();
        String actualText = "Лисин Дмитрий Викторовичh";
        textAssert(text,actualText);
    }
}
