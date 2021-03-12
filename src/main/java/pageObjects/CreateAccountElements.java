package main.java.pageObjects;

public interface CreateAccountElements {

    String CREATE_ACCOUNT_TEXT = "//div[contains(text(),'Create account')]";
    String USERNAME_TEXTBOX = "//input[@name='email']";
    String PASSWORD_TEXTBOX = "//input[@name='password']";
    String CREATE_BUTTON = "//button[contains(text(),'Create account')]";
}
