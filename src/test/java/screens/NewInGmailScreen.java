package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class NewInGmailScreen extends BaseScreen {
    private By gotItButton = By.id("com.google.android.gm:id/welcome_tour_got_it");


    public NewInGmailScreen(AppiumDriver driver) {
        super(driver);
    }

    public void pressGotInButton() {
        WebElement btn = driver.findElement(gotItButton);
        waitForElementToBeClicable(btn);
        btn.click();
    }

    public boolean screenIsOpen() {
        return isElementPresent(gotItButton);
    }
}
