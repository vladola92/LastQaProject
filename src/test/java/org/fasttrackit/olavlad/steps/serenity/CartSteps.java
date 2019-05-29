package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
//import org.fasttrackit.olavlad.pages.CartPage;
import org.fasttrackit.olavlad.pages.Homepage;

public class CartSteps {
    Homepage homepage;
//    CartPage cartPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();

    }

    @Step
    public void goToCartPage() {
        homepage.clickCartButton();
    }
}
