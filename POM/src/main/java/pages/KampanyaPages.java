package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KampanyaPages {

    WebDriver driver;

    public KampanyaPages(WebDriver webDriver) {
        driver = webDriver;
    }


    By closeButton = By.id("trendyol.com:id/imageButtonClose");
    By notification = By.id("trendyol.com:id/textViewOpenNotification");
    By image = By.className("android.widget.ImageView");
    By yesButton = By.id("trendyol.com:id/buttonAccept");


    public void clickCloseButton() {
        driver.findElement(closeButton).click();
    }

    public String getTextNotification() {
        return driver.findElement(notification).getText();
    }

    public boolean checkImage() {
        return driver.findElement(image).isDisplayed();
    }

    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public String getTextYesButton() {
        return driver.findElement(yesButton).getText();
    }

}
