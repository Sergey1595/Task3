package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class NewInGmailScreen extends BaseScreen {
    By gotItButton = By.id("com.google.android.gm:id/welcome_tour_got_it");


    public NewInGmailScreen(AppiumDriver driver) {
        super(driver);
    }

    public void pressGotInButton() {
        WebElement btn = driver.findElement(gotItButton);
        waitForElementToBeClicable(btn);
        btn.click();
    }
}
