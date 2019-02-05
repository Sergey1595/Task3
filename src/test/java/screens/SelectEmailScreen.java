package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SelectEmailScreen extends BaseScreen {
    public SelectEmailScreen(AppiumDriver driver) {
        super(driver);
    }

    private By listOfSetupEmails = By.id("com.google.android.gm:id/account_address");
    private By addAnotherEmailBtn = By.id("com.google.android.gm:id/setup_addresses_add_another");
    private By takeMeToGmailButton = By.id("com.google.android.gm:id/action_done");

    //if page without setup emails return false
    public boolean checkSetupEmails() {
        return getNumberOfEmails() > 0;
    }

    public List<String> getEmails() {
        if (getNumberOfEmails() == 0)
            return null;
        List<String> emailAdresses = new ArrayList<>(getNumberOfEmails());
        List<WebElement> emails = getEmailsElement();
        for (WebElement email : emails) {
            emailAdresses.add(email.getText());
        }

        return emailAdresses;
    }

    public int getNumberOfEmails() {
        waitForElementsToBeVisibility(listOfSetupEmails);
        List<WebElement> emails = driver.findElements(listOfSetupEmails);
        return emails.size();
    }

    public void pressToAddAnotherEmail() {
        waitForElementTobeClicable(addAnotherEmailBtn);
        WebElement addAnotherEmailButton = driver.findElement(addAnotherEmailBtn);
        addAnotherEmailButton.click();
    }

    //if email found return true
    public boolean checkOfExistSetupEmail(String email) {
        for (String foundEmail : getEmails())
            if (email.equals(foundEmail))
                return true;
        return false;
    }

    public void clickOnFoundEmail(String email) {
        if (!checkOfExistSetupEmail(email))
            return;
        List<WebElement> emailsElement = getEmailsElement();
        List<String> emailsStr = getEmails();
        for (int i = 0; i < getNumberOfEmails(); i++)
            if (emailsStr.equals(email))
                emailsElement.get(i).click();
    }

    List<WebElement> getEmailsElement() {
        waitForElementsToBeVisibility(listOfSetupEmails);
        return driver.findElements(listOfSetupEmails);
    }

    public void pressToTakeMeToGmail() {
        waitForElementTobeClicable(takeMeToGmailButton);
        WebElement TakeMeToGmailBtn = driver.findElement(takeMeToGmailButton);
        TakeMeToGmailBtn.click();
    }
}
