package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class homePage {

    AppiumDriver driver;

    By image = AppiumBy.className("android.widget.ImageView");
    By manButton = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By text = AppiumBy.id("trendyol.com:id/textViewOpenNotification");

    public homePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public void checkImage() {
        driver.findElement(image).isDisplayed();
    }

    public String getText() {
        return driver.findElement(text).getText();
    }

    public void clickManButton() {
        driver.findElement(manButton).click();
    }
}
