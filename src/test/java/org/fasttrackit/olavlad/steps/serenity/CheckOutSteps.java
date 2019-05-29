package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.olavlad.pages.Homepage;

public class CheckOutSteps {
    Homepage homepage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void goToChecoutPage() {
        homepage.clickCheckoutButton();
    }
}