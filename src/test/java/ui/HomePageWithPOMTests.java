package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ui.BaseTest.BASE_URL;

public class HomePageWithPOMTests extends BaseTestForPOM {

    @Test
    void openHomePageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.open();

        String actualTitle = homePage.getTitle();

        assertEquals("Hands-On Selenium WebDriver with Java", actualTitle);
    }

}

