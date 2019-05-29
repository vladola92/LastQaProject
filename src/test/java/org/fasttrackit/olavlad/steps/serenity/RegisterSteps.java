package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.olavlad.pages.Homepage;
import org.fasttrackit.olavlad.pages.RegisterPage;

public class RegisterSteps {

    Homepage homepage;
    RegisterPage registerPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void goToRegisterPage() {

        homepage.clickMyAccount();
    }

    @Step
    public void registerUser() {
        registerPage.setEmailField("sdhgkjdf@gmail.com");
        registerPage.setPasswordField("jksdfnjk3kj2135");
        registerPage.clickRegisterButton();
    }
}
