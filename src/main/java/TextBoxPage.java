import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends Page {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }
    public void inputTextBox(String name, String email, String address) {
        driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@id = 'userEmail']")).sendKeys(email);
        driver.findElement(By.xpath("//textarea[@id = 'currentAddress']")).sendKeys(address);
    }
    public void submitTextBox() {
        WebElement s = driver.findElement(By.xpath("//button[@id = 'submit']"));
        scroll(s);
    }
    public String getNameTextBox() {
        return driver.findElement(By.xpath("//p[@id = 'name']")).getAttribute("textContent");
    }
    public String getEmailTextBox() {
        return driver.findElement(By.xpath("//p[@id = 'email']")).getAttribute("textContent");
    }
    public String getAddressTextBox() {
        return driver.findElement(By.xpath("//p[@id = 'currentAddress']")).getAttribute("textContent");
    }
    public boolean emailFalseTextBox() {
        return driver.findElement(By.xpath("//input[@class='mr-sm-2 field-error form-control']")).isDisplayed();
    }
    public void clearEmailTextBox() {
        driver.findElement(By.xpath("//input[@id = 'userEmail']")).clear();
    }
}
