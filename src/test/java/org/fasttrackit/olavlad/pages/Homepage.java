package org.fasttrackit.olavlad.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class Homepage extends PageObject {

    @FindBy(id = "menu-item-122")
    private WebElementFacade myAccountButton;

    @FindBy(id = "menu-item-123")
    private WebElementFacade shopButton;

    @FindBy(id = "menu-item-124")
    private WebElementFacade cartButton;

    @FindBy(id = "menu-item-125")
    private WebElementFacade checkoutButton;

    public void clickMyAccount() {
        clickOn(myAccountButton);
    }

    public void clickShopButton() {
        clickOn(shopButton);
    }

    public void clickCartButton() {
        clickOn(cartButton);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

}
