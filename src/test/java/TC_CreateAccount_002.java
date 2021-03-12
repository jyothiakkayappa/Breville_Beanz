package test.java;

import main.java.pageEvents.CreateAccountPage;
import main.java.pageEvents.HomePage;

public class TC_CreateAccount_002 extends BaseTest {

    String INVALID_EMAIL_ID = "abc";

    public void createAccountForNewUser(){
        HomePage hp = new HomePage();
        hp.clickOnMyBeanzButton();
        hp.clickOnCreateAccountButton();

        CreateAccountPage cp = new CreateAccountPage();
        cp.verifyCreateAccountPageOpenedOrNot();
        cp.enterUserName(INVALID_EMAIL_ID);
        cp.enterUserPassword(INVALID_EMAIL_ID);
        cp.clickCreateAccountButton();
    }
}
