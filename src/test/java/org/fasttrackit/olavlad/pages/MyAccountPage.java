package org.fasttrackit.olavlad.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class MyAccountPage extends PageObject {

    @FindBy(css = "p strong")
    private WebElementFacade helloMessage;

    public void checkLoggedIn(String userName){
        helloMessage.shouldContainText("sproject");
    }
}
