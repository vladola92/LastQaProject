package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.olavlad.pages.Homepage;

public class ShopSteps {
    Homepage homepage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToShopPage(){
        homepage.clickShopButton();
    }

}
