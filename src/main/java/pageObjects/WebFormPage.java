package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormPage {
    WebDriver driver;
    private static final String WEB_FORM_URL = "web-form.html";

    public WebFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public WebElement getTitle() {
        return driver.findElement(By.className("display-6"));
    }

    public String getUrl() {
        return WEB_FORM_URL;
    }
}
