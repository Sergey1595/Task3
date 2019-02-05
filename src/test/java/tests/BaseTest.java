package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import utility.ApplicationManager;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    public static AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = ApplicationManager.initAppiumDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
