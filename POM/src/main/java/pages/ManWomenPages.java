package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManWomenPages {

    WebDriver driver;

    public ManWomenPages(WebDriver webDriver) {
        driver = webDriver;
    }

    By carpiButonu = By.id("trendyol.com:id/buttonDismiss");
    By image = By.xpath("//android.widget.LinearLayout/android.widget.ImageView");
    By text = By.className("android.widget.TextView");
    By erkekButonu = By.id("trendyol.com:id/buttonSelectGenderMan");
    By kadınButonu = By.id("trendyol.com:id/buttonSelectGenderWoman");



    public void clickCarpiButon() {
        driver.findElement(carpiButonu).click();
    }


    public void checkImage() {
        driver.findElement(image);
    }

    public String getTextText() {
        WebElement element = driver.findElement(text);
        String elementText = element.getText();
        return elementText;
    }

    public void clickErkekButton() {
        driver.findElement(erkekButonu).click();
    }

    public void getErkekButonText() {
        driver.findElement(erkekButonu).click();
    }

    public void clickKadinButton() {
        driver.findElement(kadınButonu).click();
    }

}
