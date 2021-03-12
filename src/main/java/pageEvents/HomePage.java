package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;

public class HomePage {

    public void clickOnSearchIcon() {
        ElementFetch ef =  new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.SEARCH_ICON).click();
    }

    public void searchItem(String item) {
        ElementFetch ef =  new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.SEARCH_TEXTBOX).sendKeys(item);
    }

    public void selectSearchedItem() {
        ElementFetch ef =  new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.SERACH_ELEMENT).click();
    }

    public void clickOnMyBeanzButton () {
        ElementFetch ef = new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.MY_BEANZ_ICON).click();
    }

    public void clickOnLoginButton(){
        ElementFetch ef = new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.LOGIN_BUTTON).click();
    }

    public void clickOnCreateAccountButton(){
        ElementFetch ef = new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.CREATE_ACCOUNT_BUTTON).click();
    }

    public void clickOnShopCoffeeTab(){
        ElementFetch ef = new ElementFetch();
        ef.getWebElement("xpath", HomePageElements.SHOP_COFFEE_LABEL).click();
    }

}
