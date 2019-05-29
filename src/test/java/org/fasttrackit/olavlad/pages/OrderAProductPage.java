package org.fasttrackit.olavlad.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?post_type=product")
public class OrderAProductPage extends PageObject {

    @FindBy (css = "li.post-58 a.woocommerce-LoopProduct-link")
    private WebElementFacade beltProduct;

    @FindBy (css = "button.single_add_to_cart_button")
    private WebElementFacade addToCart;


    public void clickOnBeltProduct(){
        clickOn(beltProduct);
    }
    public void clickOnAddToCart(){
        clickOn(addToCart);
    }

}
