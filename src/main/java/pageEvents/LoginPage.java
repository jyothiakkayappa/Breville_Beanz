package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class LoginPage {

    ElementFetch ef = new ElementFetch();

    public void verifyLoginPageOpenedOrNot()
    {
        Assert.assertTrue(ef.getListOfWebElements("xpath", LoginPageElements.LOGIN_TEXT).size()>0, "Login page is Not opened" );
    }

    public void verifyInvalidEmailId(String invalid)
    {
        Assert.assertTrue(ef.getListOfWebElements("xpath", LoginPageElements.INVALID_EMAIL_ID).equals(invalid), "Invalid UserName" );
    }

    public void enterUserName(String useName){
        ef.getWebElement("xpath", LoginPageElements.EMIAL_TEXTBOX).sendKeys(useName);
    }

    public void enterUserPassword(String password){
        ef.getWebElement("xpath", LoginPageElements.PASSWORD_TEXTBOX).sendKeys(password);
    }

    public  void clickLoginButton(){
        ef.getWebElement("xpath", LoginPageElements.LOGIN_BUTTON).click();
    }
}
