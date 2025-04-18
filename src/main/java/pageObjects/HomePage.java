package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //locators

    //actions
    public void open() {
        driver.get(BASE_URL);
    }

    public String getTitle() {
        return driver.getTitle();
    }
    //method -> open another Page Object
    public WebFormPage openWebFormPage() {
        driver.findElement(By.xpath("//h5[text()='Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'web-form')]")).click();
        return new WebFormPage(driver);
    }
}
