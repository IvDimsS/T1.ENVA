package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import screens.ExpenseReports;

public class ExpenseReportsTest extends ExpenseReports {

    @Test(groups = "smoke android")
    @Epic("Представительские расходы")
    @Story("Обновление экрана")
    public void pullToRefreshScreen() {
        servicesButtonClick();
        serviceExpenseReportButtonClick();
        pullToRefresh();
    }

    @Test(groups = "smoke android")
    @Epic("Представительские расходы")
    @Story("Поиск расхода")
    public void searchExpenseReport() {
        servicesButtonClick();
        serviceExpenseReportButtonClick();
        setSearchField();
    }

    @Test(groups = "smoke android")
    @Epic("Представительские расходы")
    @Story("Задать фильтр по убыванию")
    public void setFilters() {
        servicesButtonClick();
        serviceExpenseReportButtonClick();
        filterButtonClick();
        setFilterDesc();
        tapSelectButton();
    }

    @Test(groups = "smoke android")
    @Epic("Представительские расходы")
    @Story("Поиск расхода")
    public void deleteFilter() {
        servicesButtonClick();
        serviceExpenseReportButtonClick();
        tapResetButton();
        tapSelectButton();
    }

    @Test(groups = "smoke android")
    @Epic("Представительские расходы")
    @Story("Создание черновика")
    public void createReport() {
        servicesButtonClick();
        serviceExpenseReportButtonClick();
        tapCreateButton();
        tapSelectProjectButton();
        tapSelectProject();
        swipe();
        tapDataEvent();
        tapCalendarDate();
        setPlace();
        setContraAgent();
        setTarget();
        setResult();
        setFDNumber();
        tapCalendarCheck();
        tapCalendarDate();
        setTotal();
        setTaxes();
        swipe();
        setSupervisor();
        swipe();
        tapDraftButton();
        tapSaveButton();
        tapOkButton();
    }
}
