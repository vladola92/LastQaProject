package org.fasttrackit.olavlad.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.olavlad.pages.Homepage;
import org.fasttrackit.olavlad.pages.OrderAProductPage;

public class OrderAProductSteps {

    Homepage homepage;
    OrderAProductPage orderAProductPage;


    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToShopPage(){
        homepage.clickShopButton();
    }


    @Step
    public void orderAbelt(){
        orderAProductPage.clickOnBeltProduct();
        orderAProductPage.clickOnAddToCart();
    }


}
