package screens;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GotMailScreen extends BaseScreen {

    public GotMailScreen(AppiumDriver driver) {
        super(driver);
    }

    private By viewDetails = By.id("com.google.android.gm:id/send_date");
    private By fromDetails = By.id("com.google.android.gm:id/from_details");
    private By toDetails = By.id("com.google.android.gm:id/to_details");
    private By textOfEmail = By.xpath("//android.view.View[3]/android.view.View");
    private By deleteButton = By.id("com.google.android.gm:id/delete");

    public String getTextOfEmail() {
        WebElement textOfEmailElement = driver.findElement(textOfEmail);
        return textOfEmailElement.getText();
    }

    public void pressViewDetails() {
        WebElement viewDetaislBtn = driver.findElement(viewDetails);
        waitForElementToBeClicable(viewDetaislBtn);
        viewDetaislBtn.click();
    }

    //TODO write regex to correct work
    private String getEmailFrom() {
        waitForVisibility(fromDetails);
        WebElement DromDetailsElement = driver.findElement(fromDetails);
        return DromDetailsElement.getText().replaceAll("([A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,6}$)", "");
    }

    public void pressToDeleteBtn() {
        waitForElementTobeClicable(deleteButton);
        driver.findElement(deleteButton).click();
    }

    //if contains return true
    public boolean searchEmailAdressInAdressFrom(String email) {
        return getEmailFrom().contains(email);
    }

    //if texts match than return true
    public boolean compareTextInEmail(String text) {
        return getTextOfEmail().equals(text);
    }


}
