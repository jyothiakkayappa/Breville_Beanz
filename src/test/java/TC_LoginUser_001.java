package test.java;

import main.java.pageEvents.HomePage;
import main.java.pageEvents.LoginPage;
import org.testng.annotations.Test;

public class TC_LoginUser_001 extends BaseTest {
    //Constants
    String USER_NAME = "jyothi.akkayappa11@yopmail.com";
    String INVALID_USER_NAME = "abc";
    String PASSWORD = "breville123";

    @Test(description = "This method is to verify login page ") //, priority = 0
    public void loginSuccessful()
    {
        HomePage hp = new HomePage();
        implicitWait();
        hp.clickOnMyBeanzButton();
        hp.clickOnLoginButton();

        LoginPage lp = new LoginPage();
        lp.verifyLoginPageOpenedOrNot();
        lp.enterUserName(USER_NAME);
        lp.enterUserPassword(PASSWORD);
        lp.clickLoginButton();
    }

    //@Jira(ticketNumber = "TCM-")
    //@Test(description = "This method is to verify invalid Email Id ") //, priority = 1
    public void invalidLoginCredentials()
    {
        HomePage hp = new HomePage();
        implicitWait();
        hp.clickOnMyBeanzButton();
        hp.clickOnLoginButton();

        LoginPage lp = new LoginPage();
        lp.verifyLoginPageOpenedOrNot();
        lp.enterUserName(INVALID_USER_NAME);
        lp.enterUserPassword(PASSWORD);
        lp.clickLoginButton();
        lp.verifyInvalidEmailId(INVALID_USER_NAME);
    }
}
