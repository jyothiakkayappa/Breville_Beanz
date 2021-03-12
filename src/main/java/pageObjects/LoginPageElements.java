package main.java.pageObjects;

public interface LoginPageElements {

    String LOGIN_TEXT = "//div[contains(text(),'Account Login')]";
    String INVALID_EMAIL_ID = "//div[contains(text(),'Account Login')]";
    String EMIAL_TEXTBOX = "//input[contains(@name,'Username')]";
    String PASSWORD_TEXTBOX = "//input[contains(@name,'password')]";
    String LOGIN_BUTTON = "//button[contains(text(),'Log in')]";
}
