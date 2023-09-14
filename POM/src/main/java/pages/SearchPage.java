package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver webDriver){
        driver = webDriver;
    }

    By searchBar = By.id("trendyol.com:id/edittext_search_view");

    public void sendKeysSearchBar(String text){
        driver.findElement(searchBar).sendKeys(text);
    }

    public void  clickSearchButtonOnKeyboard(){

    }


}
