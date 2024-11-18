package tests;


import jdk.jfr.Description;
import org.testng.annotations.Test;
import screens.EventPage;


public class EventTest extends EventPage {

    @Test(groups = "smoke")
    @Description("Проверка экрана списка событий")
    public void eventTabList() {
        eventTabClick();
        eventCompareText();
    }

    //На деве отсутствуют события на 15 ноября, чтобы тестить детали. Нужен прод
}