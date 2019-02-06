package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.*;

public class GmailTest extends BaseTest {


    @Test
    public void sentTestMail() {
        String testEmail = "qatestlabusa@gmail.com";
        String testSubjectOfMail = "Test";
        String composeOfEmail = "Test.Test,Test$Test/Test}{TEST";

        NewInGmailScreen newIngmailScreen = new NewInGmailScreen(driver);
        SelectEmailScreen selectEmailScreen = new SelectEmailScreen(driver);
        EmailsPrimaryScreen emailsPrimaryScreen = new EmailsPrimaryScreen(driver);
        WriteEmailScreen writeEmailScreen = new WriteEmailScreen(driver);
        AllMailScreen allMailScreen = new AllMailScreen(driver);
        GotMailScreen gotMailScreen = new GotMailScreen(driver);

        //if open screem "New in Gmail" than go to "Primary screen"
        if (newIngmailScreen.screenIsOpen()) {
            newIngmailScreen.pressGotInButton();
            selectEmailScreen.pressOnFoundEmail(testEmail);
            selectEmailScreen.pressToTakeMeToGmail();
        }

        //open screen "Write new Email"
        emailsPrimaryScreen.pressToWriteEmailBtn();

        //send test mail
        writeEmailScreen.writeEmailAdress(testEmail);
        writeEmailScreen.pressTosubjectField();
        writeEmailScreen.writeSubjectOfEmail(testSubjectOfMail);
        writeEmailScreen.pressToComposeEmailField();
        writeEmailScreen.writeComposeOfEmail(composeOfEmail);
        writeEmailScreen.pressToSenMailBtn();

        //go to "all Emails"
        emailsPrimaryScreen.pressToOpenMenyBtn();
        emailsPrimaryScreen.pressToAllMailBtn();

        //press to first Email in list
        allMailScreen.pressOnFirstEmail();

        //compare info about sent Email and got Email
        gotMailScreen.pressViewDetails();
        Assert.assertTrue(gotMailScreen.searchEmailAdressInAdressFrom(testEmail));
        Assert.assertTrue(gotMailScreen.compareTextInEmail(composeOfEmail));

        //delete letter
        gotMailScreen.pressToDeleteBtn();
    }
}
