package apparatTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewApparatTest extends ParentTest {

    final private String APPARAT_COMMENT = "NewSomeApparat";
    final private String APPARAT_NUMBER = "262626";

    public AddNewApparatTest(String browser) {
        super(browser);
    }

    @Test

    public void addNewApparat() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuApparat();
        apparatPage.checkZagolovok("Аппарат Список");
        apparatPage.cliclOnAddButton();
        editApparatPage.checkZagolovok("Словарь");
        editApparatPage.enterTextInToInputApparatNumber(APPARAT_NUMBER);
        editApparatPage.enterTextInToInputApparatComment(APPARAT_COMMENT);
        editApparatPage.clickOnSozdatButton();
        apparatPage.checkZagolovok("Аппарат Список");
        checkAcceptanceCriteria(APPARAT_COMMENT + "Cannot fined apparat in list", apparatPage.isApparatInList(APPARAT_COMMENT),true
        );
    }
}
