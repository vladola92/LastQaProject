package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.olavlad.pages.Homepage;
import org.fasttrackit.olavlad.pages.LoginPage;
import org.fasttrackit.olavlad.pages.MyAccountPage;

public class LoginSteps {

    Homepage homepage;  // is de doua ori ca declaram tipul si numele
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void goToLoginPage() {
        homepage.clickMyAccount();
    }

    @Step
    public void loginUser() {
        loginPage.setUsernameField("sproject@mailinator.com");
        loginPage.setPassField("QWERTYuiop12345^&*()");
        loginPage.clickLoginButton();
    }
    @Step
    public void checkUserIsLogged(){
        myAccountPage.checkLoggedIn("sproject");
    }

}
