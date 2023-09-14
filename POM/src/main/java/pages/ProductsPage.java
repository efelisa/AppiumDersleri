package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver webDriver) {
        driver = webDriver;
    }

    By popup = By.id("trendyol.com:id/textViewTooltipTitle");

    public String getTextPopup() {
        return driver.findElement(popup).getText();
    }

}
