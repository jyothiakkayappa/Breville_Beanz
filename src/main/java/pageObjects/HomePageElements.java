package main.java.pageObjects;

public interface HomePageElements {

    String MY_BEANZ_ICON = "//body/div[5]/div[1]/div[1]/nav[1]/div[2]/div[2]";
    String CREATE_ACCOUNT_BUTTON = "//a[@id='js-my-beanz-sign-up']";
    String LOGIN_BUTTON = "//a[@id='js-my-beanz-sign-in']";

    //Search Locators
    String SEARCH_ICON = "//a[contains(@class, 'nav-item nav-link search-defualt') and @title = 'Beanz Search']";
    String SEARCH_TEXTBOX = "//input[@id='searchbox-input']";
    String SERACH_ELEMENT = "//img[contains(@class, 'd-flex align-self-center mr-1') and @title = 'Monarch']";

    //Headers Locators
    String LOGO_BUTTON = "//body/div[4]/div[1]/nav[1]/a[1]/img[1]";
    String SHOP_COFFEE_LABEL =  "//a[contains(@class, 'nav-link p-3 ') and @title = 'Shop Coffee']";
    String OUR_ROASTER_LABEL= "//a[contains(@class, 'nav-link p-3 ') and @title = 'Our Roasters']";
}
