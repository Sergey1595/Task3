package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BaseScreen {

    protected final AppiumDriver driver;
    protected final WebDriverWait wait;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    public void waitForVisibility(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementTobeClicable(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitForElementToBeClicable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementsToBeVisibility(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        List<WebElement> listOfElements = driver.findElements(by);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfElements));
    }


}
