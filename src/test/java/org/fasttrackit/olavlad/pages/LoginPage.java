package org.fasttrackit.olavlad.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")

public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade usernameField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButton;

    public void setUsernameField(String username) {
        typeInto(usernameField, username);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
}
