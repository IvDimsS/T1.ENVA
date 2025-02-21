package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import screens.ProfilePage;


public class ProfileTest extends ProfilePage {

    @Test(groups = "smoke android")
    @Story("Изменение аватара")
    @Epic("Профиль")
    public void testChangePhoto() {
        profileTabClick();
        photoButtonClick();
        changePhotoButtonClick();
        pictureClick();
    }

    @Test(groups = "smoke android")
    @Story("Переход в департамент пользователя")
    @Epic("Профиль")
    public void checkUserDepartment () {
        profileTabClick();
        userDepartmentClick();
    }

    @Test(groups = "smoke android")
    @Description("Проверка перехода в профиль руководителя")
    @Story("Переход на экран команды")
    @Epic("Профиль")
    public void testSupervisor() {
        profileTabClick();
        supervisor();
    }

    @Test(groups = "smoke android3")
    @Description("Проверка перехода в профиль HR BP")
    @Story("Переход на экран команды")
    @Epic("Профиль")
    public void testHRBP() throws InterruptedException {
        profileTabClick();
        userHRBPClick();
    }

    @Test(groups = "smoke android")
    @Description("Просмотр данных о приложении")
    @Story("Переход на экран команды")
    @Epic("Профиль")
    public void testAboutApp() {
        profileTabClick();
        bshButtonsClick();
        aboutAppClick();
    }


}