package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailsPrimaryScreen extends BaseScreen {

    public EmailsPrimaryScreen(AppiumDriver driver){
        super(driver);
    }

    private By startWriteEmailBtn = By.id("com.google.android.gm:id/compose_button");


    public void pressToWriteEmailBtn(){
        waitForElementsToBeVisibility(startWriteEmailBtn);
        WebElement WriteEmailBtn = driver.findElement(startWriteEmailBtn);
        WriteEmailBtn.click();
    }
}
