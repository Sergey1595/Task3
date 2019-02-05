package tests;

import org.testng.annotations.Test;
import screens.EmailsPrimaryScreen;
import screens.NewInGmailScreen;
import screens.SelectEmailScreen;
import screens.WriteEmailScreen;

public class GmailTest extends BaseTest {

    @Test
    public void sentTestMail() {
        String testEmail = "qatestlabusa@gmail.com";
//        NewInGmailScreen newIngmailScreen = new NewInGmailScreen(driver);
//        newIngmailScreen.pressGotInButton();
//
//        SelectEmailScreen selectEmailScreen = new SelectEmailScreen(driver);
//        selectEmailScreen.clickOnFoundEmail(testEmail);
//        selectEmailScreen.pressToTakeMeToGmail();
//
        EmailsPrimaryScreen emailsPrimaryScreen = new EmailsPrimaryScreen(driver);
        emailsPrimaryScreen.pressToWriteEmailBtn();

        WriteEmailScreen writeEmailScreen = new WriteEmailScreen(driver);
        writeEmailScreen.writeEmailAdress(testEmail);
        writeEmailScreen.pressTosubjectField();
        writeEmailScreen.writeSubjectOfEmail("test");
        writeEmailScreen.pressToComposeEmailField();
        writeEmailScreen.writeComposeOfEmail("adadadaffefasfasfasdadadaaaaasa");
    }
}
