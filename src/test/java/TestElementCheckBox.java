import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestElementCheckBox extends TestBase {
    @Test
    public void testElementForms() {
        mainPage.openMainPage();
        mainPage.openElement();
        elementPage.openCheckBox();
        checkBoxPage.deployCheckBox(0);
        checkBoxPage.deployCheckBox(2);
        checkBoxPage.deployCheckBox(4);
        checkBoxPage.checkCheckBox(1);
        checkBoxPage.checkCheckBox(6);
        assertEquals("You have selected :desktopnotescommandsprivate", checkBoxPage.getResultCheckBox());
        checkBoxPage.checkCheckBox(6);
        assertEquals("You have selected :desktopnotescommands", checkBoxPage.getResultCheckBox());


    }
}
