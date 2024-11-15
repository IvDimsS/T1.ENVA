package tests;


import org.testng.annotations.Test;
import screens.EventTabPage;


public class EventTabTest extends EventTabPage {

    @Test(groups = "smoke")
    public void eventTabList() {
        eventTabClick();
    }
}