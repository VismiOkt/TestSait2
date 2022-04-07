import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementPage extends Page {
    public ElementPage(WebDriver driver) {
        super(driver);
    }
    public void openTextBox() {
        driver.findElement(By.xpath("//span[.= 'Text Box']")).click();
    }
    public void openCheckBox() {
        driver.findElement(By.xpath("//span[.= 'Check Box']")).click();
    }
    public void openRadioButton() {
        driver.findElement(By.xpath("//span[.= 'Radio Button']")).click();
    }





}
