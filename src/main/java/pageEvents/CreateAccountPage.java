package main.java.pageEvents;

import main.java.pageObjects.CreateAccountElements;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class CreateAccountPage {

    ElementFetch ef = new ElementFetch();

    public void verifyCreateAccountPageOpenedOrNot()
    {
        Assert.assertTrue(ef.getListOfWebElements("xpath", CreateAccountElements.CREATE_ACCOUNT_TEXT).size()>0, "Login page is Not opened" );
    }

    public void enterUserName(String useName){
        ef.getWebElement("xpath", CreateAccountElements.USERNAME_TEXTBOX).sendKeys(useName);
    }

    public void enterUserPassword(String password){
        ef.getWebElement("xpath", CreateAccountElements.PASSWORD_TEXTBOX).sendKeys(password);
    }

    public  void clickCreateAccountButton(){
        ef.getWebElement("xpath", CreateAccountElements.CREATE_BUTTON).click();
    }
}
