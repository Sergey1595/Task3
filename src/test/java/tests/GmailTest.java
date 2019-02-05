package tests;

import org.testng.annotations.Test;
import screens.NewInGmailScreen;

public class GmailTest extends BaseTest {

    @Test
    public void sentTestMail() {
        NewInGmailScreen newIngmailScreen = new NewInGmailScreen(driver);
        newIngmailScreen.pressGotInButton();
    }
}
