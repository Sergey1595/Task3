package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;


public class AllMailScreen extends BaseScreen {
    //TODO change in future
    private By listOfEmails = By.xpath("//android.support.v7.widget.RecyclerView/android.view.View");

    public AllMailScreen(AppiumDriver driver) {
        super(driver);
    }

    public List<WebElement> getEmailsElements() {
        waitForElementsToBeVisibility(listOfEmails);
        return new LinkedList<WebElement>(driver.findElements(listOfEmails));
    }

    public int getNumberOfEmails() {
        return getEmailsElements().size();
    }

    public void pressOnFirstEmail() {
        WebElement firsnEmails = getEmailsElements().get(0);
        waitForElementToBeClicable(firsnEmails);
        firsnEmails.click();
    }
}
