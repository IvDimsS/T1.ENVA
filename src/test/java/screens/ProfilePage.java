package screens;

import base.BaseObject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProfilePage extends BaseObject {
    //Android locators and tests
    String photoButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]";
    String profileTab = "//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.view.ViewGroup/android.widget.TextView";
    String supervisorTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]";
    String userDepartment = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]";
    String userHRBP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]/android.widget.TextView[2]";
    String bshButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]";
    String picture = "//android.widget.LinearLayout[@content-desc=\"istockphoto-517188688-1024x1024.jpg, 212 kB, 3:13 AM\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView";
    String changePhotoButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.widget.Button";
    String aboutAppButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[4]";

    String text;

    @Step("Нажать кнопку Профиль на таббаре")
    public void profileTabClick() {
        clickKey(profileTab);
    }

    @Step("Нажать аватар")
    public void photoButtonClick() {
        clickKey(photoButton);
    }

    @Step("Нажать кнопку Изменить фото")
    public void changePhotoButtonClick() {
        clickKey(changePhotoButton);
    }

    @Step("Нажать на картинку в галерее")
    public void pictureClick() {
        clickKey(picture);
        isClickable(photoButton);
    }

    @Step("Нажать на таб Руководитель")
    public void supervisor() {
        clickKey(supervisorTab);
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView")).getText();
        String actualText = "Контакты";
        textAssert(text,actualText);
    }

    @Step("Нажать на департамент пользователя")
    public void userDepartmentClick() {
        clickKey(userDepartment);
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView")).getText();
        String actualText = "Контакты";
        textAssert(text,actualText);
    }

    @Step("Нажать на таб HR BP")
    public void userHRBPClick() {
        clickKey(userHRBP);
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView")).getText();
        String actualText = "Контакты";
        textAssert(text,actualText);
    }

    @Step("Нажать на кнопку дополнительных функций")
    public void bshButtonsClick () {
        clickKey(bshButton);
    }

    @Step("Нажать кнопку О приложении")
    public void aboutAppClick () {
        clickKey(aboutAppButton);
        text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView[1]")).getText();
        String actualText = "О приложении";
        textAssert(text,actualText);
    }



}
