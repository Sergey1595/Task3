package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WriteEmailScreen extends BaseScreen {
    public WriteEmailScreen(AppiumDriver driver) {
        super(driver);
    }

    private By writeToField = By.id("com.google.android.gm:id/to");
    private By subjectField = By.id("com.google.android.gm:id/subject");
    private By composeEmailField = By.id("com.google.android.gm:id/body_wrapper");
    private By sendMailBtn = By.id("com.google.android.gm:id/send");

    public void pressToWriteToField() {
        waitForElementsToBeVisibility(writeToField);
        driver.findElement(writeToField).click();
    }

    public void pressTosubjectField() {
        waitForElementsToBeVisibility(subjectField);
        driver.findElement(subjectField).click();
    }

    public void pressToComposeEmailField() {
        waitForElementsToBeVisibility(composeEmailField);
        driver.findElement(composeEmailField).click();
    }

    public void writeEmailAdress(String Email) {
        waitForElementsToBeVisibility(writeToField);
        WebElement writeToFieldElem = driver.findElement(writeToField);
        writeToFieldElem.sendKeys(Email);
    }

    public void writeSubjectOfEmail(String subject) {
        waitForElementsToBeVisibility(subjectField);
        WebElement writeSubjectOfEmail = driver.findElement(subjectField);
        writeSubjectOfEmail.sendKeys(subject);
    }

    public void writeComposeOfEmail(String compose) {
        waitForElementsToBeVisibility(composeEmailField);
        WebElement writeComposeEmailField = driver.findElement(composeEmailField);
        writeComposeEmailField.sendKeys(compose);
    }

    public void pressToSenMailBtn() {
        waitForElementTobeClicable(sendMailBtn);
        driver.findElement(sendMailBtn).click();
    }


}
