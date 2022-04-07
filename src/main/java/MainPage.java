import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends Page {
    public MainPage(WebDriver driver){
        super(driver);
    }
    public void openMainPage() {
        driver.get("https://demoqa.com/");
    }
    public void openElement() {
        WebElement s = driver.findElement(By.xpath("//h5[text() = 'Elements']/.."));
        scroll(s);
    }
    public void openForms() {
        WebElement s = driver.findElement(By.xpath("//h5[text() = 'Forms']"));
        scroll(s);
    }
    public void openFrame() {
        WebElement s = driver.findElement(By.xpath("//h5[text() = 'Forms']"));
        scroll(s);
    }


}
