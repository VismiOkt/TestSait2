import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage extends Page {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }
    public void deployCheckBox(int x) {
        List<WebElement> s = driver.findElements(By.xpath("//button[@title = 'Toggle']"));
        s.get(x).click();
    }
    public void checkCheckBox(int y) {
        List<WebElement> s = driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
        s.get(y).click();
    }
    public String getResultCheckBox() {
        return driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getAttribute("textContent");

    }

}
