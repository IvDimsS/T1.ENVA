package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import screens.MainPage;


public class MainTest extends MainPage {

    @Test(groups = "smoke android")
    @Story("Переход в Мои задачи по виджету")
    @Epic("Главный экран")
    public void checkInboxWidget () {
        widgetInboxClick();
    }

    @Test(groups = "smoke android")
    @Story("Поиск пользователя по ФИО")
    @Epic("Главный экран")
    public void findEmployer () {
        searchFieldClick();
        setTest();
    }


    @Test(groups = "smoke android2")
    @Description("Поиск сотрудника")
    @Story("Поиск")
    @Epic("Профиль")
    public void testFindEmploy() {
        searchFieldClick();
        setTest();
        employCartClick();
    }

}
