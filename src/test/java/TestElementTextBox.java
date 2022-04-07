import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestElementTextBox extends TestBase {
    String name = "Иван";
    String emailFalse = "t";
    String email = "r@mail.ru";
    String address = "sity";
    @Test
    public void testElementTextBox() {
        mainPage.openMainPage();
        mainPage.openElement();
        elementPage.openTextBox();
        textBoxPage.inputTextBox(name, emailFalse, address);
        textBoxPage.submitTextBox();
        assertTrue(textBoxPage.emailFalseTextBox());
        textBoxPage.clearEmailTextBox();
        textBoxPage.inputTextBox("", email, "");
        textBoxPage.submitTextBox();
        assertEquals(textBoxPage.getNameTextBox(), "Name:" + name);
        assertEquals(textBoxPage.getEmailTextBox(), "Email:" + email);
        assertEquals(textBoxPage.getAddressTextBox(), "Current Address :" + address + " ");

    }


}
