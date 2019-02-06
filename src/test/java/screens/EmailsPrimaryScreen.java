package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailsPrimaryScreen extends BaseScreen {

    public EmailsPrimaryScreen(AppiumDriver driver) {
        super(driver);
    }


    private By startWriteEmailBtn = By.id("com.google.android.gm:id/compose_button");
    private String MenuBtnAccId = "Open navigation drawer";
    private By allMailBtn = By.xpath("//android.widget.LinearLayout[11]");


    public void pressToWriteEmailBtn() {
        waitForElementsToBeVisibility(startWriteEmailBtn);
        driver.findElement(startWriteEmailBtn).click();
    }

    public void pressToOpenMenyBtn() {
        MobileElement openMenyBtn = (MobileElement) driver.findElementByAccessibilityId(MenuBtnAccId);
        waitForElementToBeClicable(openMenyBtn);
        openMenyBtn.click();
    }

    public void pressToAllMailBtn() {
        WebElement allMailButton = driver.findElement(allMailBtn);
        waitForElementToBeClicable(allMailButton);
        allMailButton.click();
    }


}
